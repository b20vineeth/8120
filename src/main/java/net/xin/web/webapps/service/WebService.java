package net.xin.web.webapps.service;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserSetupForm; 
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.webapps.vo.UserSetup;

public interface WebService {

 
	ValidationForm Signup(UserSetupForm form);
 

}
