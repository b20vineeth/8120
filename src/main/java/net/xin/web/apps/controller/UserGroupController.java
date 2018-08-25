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
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.service.auth.AuthService;
import net.xin.web.service.auth.UserGroupService;
import net.xin.web.vo.settings.UserSetup; 

@Controller
public class UserGroupController   {

	@Autowired
	protected UserGroupService service;
	Gson gson;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;
	@RequestMapping("/userGroup.saveGroup")
	public String  userGroupSaveGroup(ModelMap modelMap) 
	{
		
		UserGroupForm form=new UserGroupForm();
		ValidationForm userSetup=new ValidationForm();
		userSetup=service.saveGroup(form);
			 
		return ""; 

	}
	 
	@RequestMapping("/userGroup.listGroup")
	public String  userGroupListGroup(ModelMap modelMap) 
	{
		 
			//userSetup=service.Signup(form);
			 
		return ""; 

	}
	 

}
