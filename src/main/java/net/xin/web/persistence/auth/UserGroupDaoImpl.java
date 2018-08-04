package net.xin.web.persistence.auth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.utility.Query.AuthQueryResource;
import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;


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
