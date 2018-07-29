package net.xin.web.persistence.settings;

import org.hibernate.Session;

import net.xin.web.vo.settings.Module;
 

public interface ModuleDao {

	String save();

	void transaction(Session session);

	Module moduleSave(Module moduleVo);

	Module find(String moduleId);

}
