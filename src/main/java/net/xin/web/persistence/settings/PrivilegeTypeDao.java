package net.xin.web.persistence.settings;

import org.hibernate.Session;

import net.xin.web.form.settings.PrivilegeTypeForm;
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;
 

public interface PrivilegeTypeDao {

	void transaction(Session session);
 
	void SavePrivilegeType(PrivilegeTypeForm form);
 
}
