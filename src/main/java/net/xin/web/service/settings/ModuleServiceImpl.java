package net.xin.web.service.settings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 

import net.xin.web.application.settings.ModuleApp;
import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.FormValidation;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;

@Component
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleApp moduleApp;
	@Override
	public String save() {

		return moduleApp.save();
	}
	@Override
	public ValidationForm moduleSave(ModuleForm module, UserBean user) {

		ValidationForm obj=new FormValidation().validate(module);
		if(obj.isResult())
		{
			return moduleApp.moduleSave(module,user);
		}
		return null; 
	}

}
