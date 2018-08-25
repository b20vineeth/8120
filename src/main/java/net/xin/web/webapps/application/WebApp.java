package net.xin.web.webapps.application;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserSetupForm; 
import net.xin.web.packages.framework.ValidationForm;

public interface WebApp {

	  
	ValidationForm Signup(UserSetupForm form);
	
}
