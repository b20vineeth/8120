package net.xin.web.application.auth;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.persistence.auth.AuthDao;
import net.xin.web.persistence.settings.ModuleDao;
import net.xin.web.utility.beanCopy.BeanCopy;
import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;

@Service
@Transactional
public class AuthAppImpl implements AuthApp {


	@Autowired
	private AuthDao authdao;
	@Autowired
	private SessionFactory sessionFactory; 
	private Session session;
	private Transaction tx; 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

 

	 

	@Override
	public ValidationForm Signup(UserSetupForm form) {



		ValidationForm validationForm=null;
		try 
		{


			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			authdao.transaction(session);

			UserSetup user;
			if(form.getUserId()!=null && 
					form.getUserId().trim().length()>0)
			{
				form.setUserId(new PasswordSecurity().decrypt(form.getUserId()));
				user=authdao.find(form.getUserId());
				user=new BeanCopy().copyUserSetup(form,user);
			}
			else
			{
				user=new BeanCopy().copyUserSetup(form);
			}

		


			user=authdao.save(user);
			validationForm=new ValidationForm();
			validationForm.setObj(user);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
		}
		session.close();
		return  validationForm;
	}


}
