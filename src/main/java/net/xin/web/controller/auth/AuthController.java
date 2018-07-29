package net.xin.web.controller.auth;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.service.auth.AuthService;
import net.xin.web.vo.settings.UserSetup; 

@Controller
public class AuthController   {

	@Autowired
	protected AuthService service;
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
		UserBean user =new UserBean();
		String data=null;
		if(user.getUserSetup()==null)
		{
			UserSetupForm form=new  UserSetupForm();
			form.setEmail("Vineeth@gmail.com");
			form.setFirstName("Vineethb");
			form.setLastName("B");
			form.setMobileNumber("1196541880");
			form.setPassword("9638527410");
			form.setPrefixMob("963");
			form.setUserName("VineethB1");
			gson= new Gson();
			try {
				form.setUserId(new PasswordSecurity().encrypt("5"));
			} catch ( Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			String datas = gson.toJson(form);
			form= gson.fromJson(datas,UserSetupForm.class);
			System.out.println(datas);
			ValidationForm userSetup=new ValidationForm();
			userSetup=service.Signup(form);
			datas=gson.toJson(userSetup);
			System.out.println(datas);

		}
		else
		{
			data="AF";
		}
		return data; 

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
