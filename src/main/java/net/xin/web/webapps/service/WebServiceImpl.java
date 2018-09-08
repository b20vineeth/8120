package net.xin.web.webapps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.xin.web.packages.framework.FormValidation; 
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.webapps.ResultForm.Form;
import net.xin.web.webapps.application.WebApp;
import net.xin.web.webapps.entity.Filter.LoginFilter;
import net.xin.web.webapps.form.UserSetupForm;
import net.xin.web.webapps.form.admin.LoginForm;
import net.xin.web.webapps.vo.UserSetup; 

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

	@Override
	public Form getHompageMenu(String string) {
		return moduleApp.getHompageMenu(string);
	}

	@Override
	public ValidationForm authenticateUser(LoginForm login) {
		
		LoginFilter filter =new LoginFilter(login);
		ValidationForm form;
		if(filter.isValidate())
		{
			return moduleApp.authenticateUser(filter);
		}
		else
		{
			ValidationForm validate=new ValidationForm();
			validate.setObj(login);
			validate.setItem(filter.getError());
			return  validate;
		}
		 
	}


}
