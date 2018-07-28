package net.xin.web.application.settings;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.persistence.settings.ModuleDao;
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
	public ValidationForm moduleSave(ModuleForm module, UserBean user) {
		
		ValidationForm form=null;
		try 
		{
			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			moduledao.transaction(session);
			
			
			Module moduleVo=new Module();
			
			
			moduleVo=moduledao.moduleSave(moduleVo);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
		}
		session.close();
		return  form;
		
	}


}
