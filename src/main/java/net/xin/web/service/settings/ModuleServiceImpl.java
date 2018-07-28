package net.xin.web.service.settings;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.xin.web.application.settings.ModuleApp;

@Component
public class ModuleServiceImpl implements ModuleService {
	 
	@Autowired
	private ModuleApp moduleApp;
	@Override
	public String save() {
		 
		return moduleApp.save();
	}

}
