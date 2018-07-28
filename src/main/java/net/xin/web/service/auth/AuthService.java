package net.xin.web.service.auth;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.vo.settings.UserSetup;

public interface AuthService {

 
	ValidationForm Signup(UserSetupForm form);
 

}
