package net.xin.web.application.auth;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.persistence.auth.AuthDao;
import net.xin.web.persistence.auth.UserGroupDao;
import net.xin.web.persistence.settings.ModuleDao;
import net.xin.web.utility.beanCopy.BeanCopy;
import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;

@Service
@Transactional
public class UserGroupAppImpl implements UserGroupApp {


	@Autowired
	private UserGroupDao userGroupdao;
	@Autowired
	private SessionFactory sessionFactory; 
	private Session session;
	private Transaction tx; 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

 

	 

 





	@Override
	public ValidationForm saveGroup(UserGroupForm form) {
		ValidationForm validationForm=null;
		try 
		{


			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			userGroupdao.transaction(session);

			userGroupdao.saveGroup(form);
			
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
