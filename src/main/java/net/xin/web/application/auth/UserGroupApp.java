package net.xin.web.application.auth;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;

public interface UserGroupApp {

	ValidationForm saveGroup(UserGroupForm form  );
 
}
