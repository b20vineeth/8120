package net.xin.web.apps.application;
 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.apps.persistence.WebDao; 
 

@Service
@Transactional
public class WebAppImpl implements WebApp {


	@Autowired
	private WebDao authdao;
	@Autowired
	private SessionFactory sessionFactory; 
	private Session session;
	private Transaction tx; 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

 

//	 
//
//	@Override
//	public ValidationForm Signup(UserSetupForm form) {
//
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
//		return  validationForm;
//	}


}
