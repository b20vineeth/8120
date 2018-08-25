package net.xin.web.persistence.auth;

import org.hibernate.Session;

import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;
 

public interface UserGroupDao {

	void transaction(Session session);

	void saveGroup(UserGroupForm form);
 
}
