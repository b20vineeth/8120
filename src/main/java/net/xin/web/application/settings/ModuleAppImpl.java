package net.xin.web.application.settings;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import net.xin.web.persistence.settings.ModuleDao;

@Service
@Transactional
public class ModuleAppImpl implements ModuleApp {


	@Autowired
	private ModuleDao module;
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
			module.transaction(session);
			module.save();

			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
		}
		session.close();
		return  "";
	}


}
