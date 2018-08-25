package net.xin.web.webapps.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.utility.Query.AuthQueryResource;
import net.xin.web.webapps.vo.Module;
import net.xin.web.webapps.vo.UserSetup;


@Component
public class AuthDaoImpl implements AuthDao {

	Session session;



	@Override
	public void transaction(Session session) {

		this.session=session;
	}



	@Override
	public UserSetup  find(String userId) {
		UserSetup user=null;
		if(userId!=null)
		{
			Integer userids=Integer.parseInt(userId);
			user = (UserSetup) session.createQuery(AuthQueryResource.FETCH_BY_USER_ID)
					.setLong("userId",userids).uniqueResult();

		}
		return user;
	}

	@Override
	public UserSetup save(UserSetup user) {
		try{
			session.saveOrUpdate(user);
			return user;
		}
		catch(Exception e){}
		return null;
	}

}
