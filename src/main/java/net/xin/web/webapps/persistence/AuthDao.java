package net.xin.web.webapps.persistence;

import org.hibernate.Session;

import net.xin.web.webapps.entity.Filter.LoginFilter;
import net.xin.web.webapps.vo.Module;
import net.xin.web.webapps.vo.UserSetup;
 

public interface AuthDao {

	UserSetup save(UserSetup user);

	void transaction(Session session);

	 
	UserSetup find(String decrypt);

	UserSetup authenticateUser(LoginFilter filter);

}
