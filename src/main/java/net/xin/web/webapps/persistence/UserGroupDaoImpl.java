package net.xin.web.webapps.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import net.xin.web.utility.Query.AuthQueryResource;
import net.xin.web.webapps.form.UserGroupForm;
import net.xin.web.webapps.form.UserSetupForm;
import net.xin.web.webapps.vo.Module;
import net.xin.web.webapps.vo.UserSetup;


@Component
public class UserGroupDaoImpl implements UserGroupDao {

	Session session;



	@Override
	public void transaction(Session session) {

		this.session=session;
	}



	@Override
	public void saveGroup(UserGroupForm form) {
		// TODO Auto-generated method stub
		
	}


 

}
