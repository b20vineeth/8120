package net.xin.web.webapps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.xin.web.packages.framework.FormValidation; 
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.webapps.application.WebApp;
import net.xin.web.webapps.form.UserSetupForm; 

@Component
public class WebServiceImpl implements WebService {

	@Autowired
	private WebApp moduleApp;
 
	@Override
	public ValidationForm Signup(UserSetupForm form) {
		ValidationForm validationform=new FormValidation().validate(form);
		
		if(validationform.isResult())
			return moduleApp.Signup(form);
		else
			return validationform;
 
	}


}
