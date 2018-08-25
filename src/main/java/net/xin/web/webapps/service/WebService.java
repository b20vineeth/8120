package net.xin.web.webapps.service;

import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.webapps.form.ModuleForm;
import net.xin.web.webapps.form.UserSetupForm;
import net.xin.web.webapps.vo.UserSetup;

public interface WebService {

 
	ValidationForm Signup(UserSetupForm form);
 

}
