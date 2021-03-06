package net.xin.web.webapps.service;

import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.webapps.ResultForm.Form;
import net.xin.web.webapps.form.ModuleForm;
import net.xin.web.webapps.form.UserSetupForm;
import net.xin.web.webapps.form.admin.LoginForm;
import net.xin.web.webapps.vo.UserSetup;

public interface WebService {

 
	ValidationForm Signup(UserSetupForm form);

	Form getHompageMenu(String string);

	ValidationForm authenticateUser(LoginForm login);
 

}
