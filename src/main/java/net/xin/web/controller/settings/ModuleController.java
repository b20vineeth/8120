package net.xin.web.controller.settings;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.service.settings.ModuleService;

@Controller
public class ModuleController   {

	@Autowired
	protected ModuleService service;

	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;
	@RequestMapping("/module.save")
	public String  moduleSave(ModelMap modelMap) 
	{
		UserBean user =new UserBean();
		String data=null;
		if(user.getUserSetup()!=null)
		{
			ModuleForm module=new ModuleForm();

			ValidationForm	form=service.moduleSave(module,user);
			 
		}
		else
		{
			data="AF";
		}
		return data; 

	}
	
	@RequestMapping("/module.edit")
	public String  moduleEdit(ModelMap modelMap) 
	{
		UserBean user =new UserBean();
		String data=null;
		if(user.getUserSetup()!=null)
		{
			ModuleForm module=new ModuleForm();

			ValidationForm	form=service.moduleSave(module,user);
			 
		}
		else
		{
			data="AF";
		}
		return data; 

	}
	@RequestMapping("/module.List")
	public String  moduleList(ModelMap modelMap) 
	{
		UserBean user =new UserBean();
		String data=null;
		if(user.getUserSetup()!=null)
		{
			ModuleForm module=new ModuleForm();

			ValidationForm	form=service.moduleSave(module,user);
			 
		}
		else
		{
			data="AF";
		}
		return data; 

	}
	@RequestMapping("/module.get")
	public String  moduleGet(ModelMap modelMap) 
	{
		UserBean user =new UserBean();
		String data=null;
		if(user.getUserSetup()!=null)
		{
			ModuleForm module=new ModuleForm();

			ValidationForm	form=service.moduleSave(module,user);
			 
		}
		else
		{
			data="AF";
		}
		return data; 

	}


}
