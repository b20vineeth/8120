package net.xin.web.webapps.persistence;

import org.hibernate.Session;

import net.xin.web.webapps.form.UserGroupForm;
import net.xin.web.webapps.vo.Module;
import net.xin.web.webapps.vo.UserSetup;
 

public interface UserGroupDao {

	void transaction(Session session);

	void saveGroup(UserGroupForm form);
 
}
