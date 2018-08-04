package net.xin.web.application.settings;

import javax.transaction.TransactionManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.form.settings.PrivilegeTypeForm;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException;

import net.xin.web.persistence.settings.PrivilegeDao;


@Service
@Transactional
public class PrivilegeTypeAppImpl implements PrivilegeTypeApp {


	@Autowired
	private PrivilegeDao dao;
	@Autowired
	private SessionFactory sessionFactory; 
	private Session session;
	private Transaction tx; 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public ValidationForm savePrivilegeType(PrivilegeTypeForm form)
			throws PrevilegeException, BussinessException, BusinessViolatonException {


		// TODO Auto-generated method stub
		ValidationForm validationForm=null;
		try 
		{


			this.session = sessionFactory.openSession();
			this.tx = session.beginTransaction();
			dao.transaction(session);

			dao.SavePrivilegeType(form);

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
