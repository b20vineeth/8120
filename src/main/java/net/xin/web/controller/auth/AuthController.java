package net.xin.web.controller.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;  

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.service.auth.AuthService;
import net.xin.web.vo.settings.UserSetup; 

@Controller
public class AuthController   {

	@Autowired
	protected AuthService service;

	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;
	@RequestMapping("/auth.save")
	public String  authSignup(ModelMap modelMap) 
	{
		UserBean user =new UserBean();
		String data=null;
		if(user.getUserSetup()==null)
		{
			UserSetupForm form=new  UserSetupForm();
			form.setEmail("Vineeth@gmail.com");
			form.setFirstName("Vineeth");
			form.setLastName("B");
			form.setMobileNumber("7896541230");
			form.setPassword("9638527410");
			form.setPrefixMob("963");
			ValidationForm userSetup=new ValidationForm();
			userSetup=service.Signup(form);
 
		}
		else
		{
			data="AF";
		}
		return data; 

	}
	
	 

}
