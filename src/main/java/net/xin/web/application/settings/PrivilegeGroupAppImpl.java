package net.xin.web.application.settings;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.PrivilegeTypeForm;
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException;
import net.xin.web.persistence.auth.AuthDao; 
import net.xin.web.persistence.auth.UserGroupDao;
import net.xin.web.persistence.settings.ModuleDao;
import net.xin.web.persistence.settings.PrivilegeGroupDao;
import net.xin.web.utility.beanCopy.BeanCopy;
import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;

@Service
@Transactional
public class PrivilegeGroupAppImpl implements PrivilegeGroupApp {


	@Autowired
	private PrivilegeGroupDao dao;
	@Autowired
	private SessionFactory sessionFactory; 
	private Session session;
	private Transaction tx; 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

  
 

	@Override
	public ValidationForm SavePrivilegeGroup(PrivilegeTypeForm form)
			throws PrevilegeException, BussinessException, BusinessViolatonException {
		ValidationForm validationForm=null;
		try 
		{


			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			dao.transaction(session);

			dao.SavePrivilegeGroup(form);
			
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
			validationForm.setResult(false);
		}
		session.close();
		return  validationForm;
	}


}
