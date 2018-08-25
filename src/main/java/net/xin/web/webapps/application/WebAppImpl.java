package net.xin.web.webapps.application;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.packages.framework.PasswordSecurity; 
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.webapps.form.ModuleForm;
import net.xin.web.webapps.form.UserSetupForm;
import net.xin.web.webapps.persistence.AuthDao;
import net.xin.web.webapps.vo.Module;
import net.xin.web.webapps.vo.UserSetup;

@Service
@Transactional
public class WebAppImpl implements WebApp {


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
		return null;

//
//
//		ValidationForm validationForm=null;
//		try 
//		{
//
//
//			this.session = sessionFactory.openSession();
//			this.tx = session.beginTransaction();
//			authdao.transaction(session);
//
//			UserSetup user;
//			if(form.getUserId()!=null && 
//					form.getUserId().trim().length()>0)
//			{
//				form.setUserId(new PasswordSecurity().decrypt(form.getUserId()));
//				user=authdao.find(form.getUserId());
//				user=new BeanCopy().copyUserSetup(form,user);
//			}
//			else
//			{
//				user=new BeanCopy().copyUserSetup(form);
//			}
//
//		
//
//
//			user=authdao.save(user);
//			validationForm=new ValidationForm();
//			validationForm.setObj(user);
//			validationForm.setResult(true);
//			
//			tx.commit();
//		}
//		catch (Exception e) {
//			tx.rollback();
//			validationForm.setResult(false);
//		}
//		session.close();
		//return  validationForm;
	}


}
