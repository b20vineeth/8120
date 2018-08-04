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
import net.xin.web.form.settings.PrivilegeTypeForm;
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException;
import net.xin.web.service.auth.AuthService;
import net.xin.web.service.auth.UserGroupService;
import net.xin.web.service.settings.PrivlegeGroupService;
import net.xin.web.service.settings.PrivlegeTypeService;
import net.xin.web.vo.settings.UserSetup; 

@Controller
public class PrivilegeGroupController   {

	@Autowired
	protected PrivlegeGroupService service;
	Gson gson;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;
	@RequestMapping("/privilegeType.Save")
	public String  savePrivilegeGroup(ModelMap modelMap) 
	{
		
		PrivilegeTypeForm form=new PrivilegeTypeForm();
		ValidationForm validation=new ValidationForm();
		try {
			validation=service.savePrivilegeGroup(form);
		} catch (PrevilegeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BussinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BusinessViolatonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		return ""; 

	}
	 
	@RequestMapping("/userGroup.listGroup")
	public String  ListPrivilegeType(ModelMap modelMap) 
	{
		 
			//userSetup=service.Signup(form);
			 
		return ""; 

	}
	 

}
