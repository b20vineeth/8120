package net.xin.web.persistence.settings;

import org.hibernate.Session;
 

public interface ModuleDao {

	String save();

	void transaction(Session session);

}
