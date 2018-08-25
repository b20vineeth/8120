package net.xin.web.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.xin.web.application.auth.AuthApp;
import net.xin.web.application.auth.UserGroupApp;
import net.xin.web.application.settings.ModuleApp;
import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.FormValidation;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.vo.settings.UserSetup;

@Component
public class UserGroupServiceImpl implements UserGroupService {

	@Autowired
	private UserGroupApp groupApp;



	@Override
	public ValidationForm saveGroup(UserGroupForm form) {
		ValidationForm validationform=new FormValidation().validate(form);

		if(validationform.isResult())
			return groupApp.saveGroup(form);
		else
			return validationform;
	}


}
