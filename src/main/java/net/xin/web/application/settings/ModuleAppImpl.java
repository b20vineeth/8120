package net.xin.web.application.settings;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.PrivilegeValidation;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException; 
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException;
import net.xin.web.packages.framework.dataConnection.Previlege;
import net.xin.web.packages.framework.dataConnection.UniqueValidation;
import net.xin.web.persistence.settings.ModuleDao; 
import net.xin.web.utility.beanCopy.BeanCopy;
import net.xin.web.vo.settings.Module;

@Service
@Transactional
public class ModuleAppImpl implements ModuleApp {


	@Autowired
	private ModuleDao moduledao;
	@Autowired
	private SessionFactory sessionFactory; 
	private Session session;
	private Transaction tx; 

	private PrivilegeValidation previlege;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public String save() {
		try 
		{
			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			moduledao.transaction(session);
			moduledao.save();
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
		}
		session.close();
		return  "";
	}


	@Override
	public ValidationForm moduleSave(ModuleForm module, UserBean user) throws BussinessException, BusinessViolatonException,PrevilegeException {

		ValidationForm form= new ValidationForm();
		try 
		{
			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			moduledao.transaction(session);
			Module moduleVo=new Module();
			previlege=new PrivilegeValidation();

			previlege.setKey("Previlege.module.CreateNew,"
					+ "Previlege.module.UpdateAll,"
					+ "Previlege.module.Update");
			previlege.setUserGroupId(1);
			previlege=new Previlege(this.session).fetch(previlege);
			if(module.getModuleId()!=null && 
					module.getModuleId().trim().length()>0)
			{
				module.setModuleId(new PasswordSecurity().decrypt(module.getModuleId()));

				if(previlege.getPrivilege().get("Previlege.module.UpdateAll").equals("Y") || previlege.getPrivilege().get("Previlege.module.Update").equals("Y"))
				{
					moduleVo=moduledao.find(module.getModuleId());
					if(previlege.getPrivilege().get("Previlege.module.UpdateAll").equals("Y") ||
							(moduleVo.getUser().getUserId().equals(user.getUserSetup().getUserId()) && previlege.getPrivilege().get("Previlege.module.Update").equals("Y") )   )
					{
						moduleVo=new BeanCopy().copyModule(module,moduleVo);
					}
					else
					{
						if(moduleVo.getUser().getUserId().equals(user.getUserSetup().getUserId()))
							throw new PrevilegeException("module-Update");  
						else
						{
							this.rollback();
							throw new PrevilegeException("module-UpdateAll");  
						}
					}
				}
				else
				{
					this.rollback();
					throw new PrevilegeException("module-Update");  
				}

			}
			else
			{
				if(previlege.getPrivilege().get("Previlege.module.CreateNew").equals("Y") )
				{
					moduleVo=new BeanCopy().copyModule(module);
					moduleVo.setUser(user.getUserSetup());
				}
				else
				{
					this.rollback();
					throw new PrevilegeException("module-CreateNew");  

				}
			}

			moduleVo.setUpdatedBy(user.getUserSetup());
			moduleVo=moduledao.moduleSave(moduleVo);

			form.setObj(moduleVo);
			form.setResult(true);
			tx.commit();

		}
		catch (ConstraintViolationException  ex)
		{

			String exceptionCode="IN";
			if(!new UniqueValidation(session).isUnique(module.getModuleCode(), "module_code", "module"))
			{
				exceptionCode="ModuleCode-D";
			}
			this.rollback();

			throw new BusinessViolatonException(exceptionCode);  


		}
		catch (Exception e) {
			this.rollback();

			throw new BussinessException("Failed - "+e.getMessage());  
		}
		session.close();
		return  form;

	}


	@Override
	public ValidationForm moduleGetById(String id, UserBean user) throws BussinessException ,PrevilegeException{

		ValidationForm form= new ValidationForm();
		try 
		{
			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			moduledao.transaction(session);
			Module moduleVo=new Module();
			ModuleForm module=null;

			previlege=new PrivilegeValidation();

			previlege.setKey("Previlege.module.CreateNew,"
					+ "Previlege.module.UpdateAll,"
					+ "Previlege.module.Update");
			previlege.setUserGroupId(1);
			previlege=new Previlege(this.session).fetch(previlege);


			if(id!=null && 
					id.trim().length()>0)
			{ 
				if(previlege.getPrivilege().get("Previlege.module.ListAll").equals("Y") ||  
						previlege.getPrivilege().get("Previlege.module.List").equals("Y") ) 
				{
					moduleVo=moduledao.find(id);
					if(moduleVo!=null)
					{ 
						if(previlege.getPrivilege().get("Previlege.module.ListAll").equals("Y") ||
								(moduleVo.getUser().getUserId().equals(user.getUserSetup().getUserId())
										&& previlege.getPrivilege().get("Previlege.module.List").equals("Y") )   )
						{
							module=new BeanCopy().copyModuleFormToModule(moduleVo); 
						}
						else
						{
							this.rollback();	
							throw new PrevilegeException("module-List"); 
						}
					}
				}
				else
				{
					this.rollback();
					throw new PrevilegeException("module-List");  
				}

			}


			form.setObj(module);
			form.setResult(true);
			tx.commit();

		}

		catch (Exception e) {

			this.rollback();
			throw new BussinessException("Failed - "+e.getMessage());  
		}
		session.close();
		return  form;
	}
	private void rollback()
	{
		tx.rollback();
		session.close();
	}


}
