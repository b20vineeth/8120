package net.xin.web.webapps.controller;

 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

 
import net.xin.web.webapps.service.WebService;
  

@Controller
public class WebController   {

	@Autowired
	protected WebService service;
	Gson gson;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;
	@RequestMapping("/auth.save")
	public String  authSignup(ModelMap modelMap) 
	{
		return null;
//		UserBean user =new UserBean();
//		String data=null;
//		if(user.getUserSetup()==null)
//		{
//			UserSetupForm form=new  UserSetupForm();
//			form.setEmail("Vineeth@gmail.com");
//			form.setFirstName("Vineethb");
//			form.setLastName("B");
//			form.setMobileNumber("1196541880");
//			form.setPassword("9638527410");
//			form.setPrefixMob("963");
//			form.setUserName("VineethB1");
//			gson= new Gson();
//			try {
//				form.setUserId(new PasswordSecurity().encrypt("5"));
//			} catch ( Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}  
//			String datas = gson.toJson(form);
//			form= gson.fromJson(datas,UserSetupForm.class);
//			System.out.println(datas);
//			ValidationForm userSetup=new ValidationForm();
//			userSetup=service.Signup(form);
//			datas=gson.toJson(userSetup);
//			System.out.println(datas);
//
//		}
//		else
//		{
//			data="AF";
//		}
//		return data; 

	}
	
	
	@RequestMapping("/login")
	public ModelAndView  loginPage(ModelMap modelMap) 
	{
		
		  
		if(true)
		{
			modelMap.addAttribute("version", "1.0.0.25.1.0");
			return new ModelAndView("settings/auth/login");
			 
		}
		else
		{
			modelMap.addAttribute("redirect", "/");
			return new ModelAndView("Screen/Redirect");
		}
	
	}
	@RequestMapping("/auth.login")
	public String  authLoginPage(ModelMap modelMap) 
	{
		
		
		
		return null;
	
	}
	@RequestMapping("/auth.authenticate")
	public String  authenticate(ModelMap modelMap) 
	{
		return null;
	
	}
	
	@RequestMapping("/auth.userList")
	public String  authUserList(ModelMap modelMap) 
	{
		return null;
	
	}
	@RequestMapping("/auth.getUser")
	public String  authGetUser(ModelMap modelMap) 
	{
		return null;
	
	}
	@RequestMapping("/auth.validateEmail")
	public String  authValidateEmail(ModelMap modelMap) 
	{
		return null;
	
	}
	@RequestMapping("/auth.resendEmail")
	public String  authResendEmail(ModelMap modelMap) 
	{
		return null;
	
	}
	@RequestMapping("/auth.verifyEmail")
	public String  authVerifyEmail(ModelMap modelMap) 
	{
		return null;
	
	}


}
