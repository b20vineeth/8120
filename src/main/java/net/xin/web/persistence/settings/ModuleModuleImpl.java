package net.xin.web.persistence.settings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xin.web.vo.UserSetup;
 

@Component
public class ModuleModuleImpl implements ModuleDao {

	Session session;

	@Override
	public String save() {
		UserSetup user=new UserSetup();
		user.setUserName("BBhh");
		session.saveOrUpdate(user);
		return  "";
	}
	 
	@Override
	public void transaction(Session session) {
		 
		this.session=session;
	}

}
