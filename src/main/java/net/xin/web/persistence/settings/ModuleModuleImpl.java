package net.xin.web.persistence.settings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.vo.settings.Module;
 

@Component
public class ModuleModuleImpl implements ModuleDao {

	Session session;

	@Override
	public String save() {
		UserSetupForm user=new UserSetupForm();
		user.setUserName("BBhh");
		session.saveOrUpdate(user);
		return  "";
	}
	 
	@Override
	public void transaction(Session session) {
		 
		this.session=session;
	}

	@Override
	public Module moduleSave(Module moduleVo) {
		session.saveOrUpdate(moduleVo);
		return moduleVo;
	}

}
