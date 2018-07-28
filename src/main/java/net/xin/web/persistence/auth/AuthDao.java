package net.xin.web.persistence.auth;

import org.hibernate.Session;

import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;
 

public interface AuthDao {

	UserSetup save(UserSetup user);

	void transaction(Session session);

	 
	UserSetup find(String decrypt);

}
