package net.xin.web.webapps.application;

import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.webapps.form.ModuleForm;
import net.xin.web.webapps.form.UserSetupForm;

public interface WebApp {

	  
	ValidationForm Signup(UserSetupForm form);
	
}
