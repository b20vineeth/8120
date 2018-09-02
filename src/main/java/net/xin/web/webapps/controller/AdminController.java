package net.xin.web.webapps.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import net.xin.web.packages.framework.Exception.IllegalArugumentthrowException; 
import net.xin.web.webapps.ResultForm.Form;
import net.xin.web.webapps.service.WebService;


@Controller
public class AdminController   {

	@Autowired
	protected WebService service;
	Gson gson;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;



	@RequestMapping("/login")
	public ModelAndView  homePage(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Login");
	}
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	@ResponseBody
	public String  authenticate(ModelMap modelMap,@RequestBody  @RequestParam("datas") String data) 
	{
		//ModelMap modelMap,@RequestBody  @RequestParam("datas") String id

		return "authenticate";
	}
	@RequestMapping("/register")
	public ModelAndView  Register(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Register");

	}


	@RequestMapping("/register.save")
	public ModelAndView  registerSave(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Register");

	}


	@RequestMapping("/userGroup")
	public ModelAndView  userGroup(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/UserGroup");
	}

	@RequestMapping("/userGroup.save")
	public ModelAndView  userGroupSave(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/UserGroup");
	}


	@RequestMapping("/privilege")
	public ModelAndView  privilege(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Privilege");
	}

	@RequestMapping("/privilege.save")
	public ModelAndView  privilegeSave(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Privilege");
	}

	@RequestMapping("/privilegeGroup")
	public ModelAndView  privilegeGroup(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Privilege");
	}

	@RequestMapping("/privilegeGroup.save")
	public ModelAndView  privilegeGroupSave(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Privilege");
	}
	@RequestMapping("/privilegeGroup.edit")
	public ModelAndView  privilegeGroupEdit(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Privilege");
	}


	@RequestMapping("/privilegeGroup.deactivate")
	public ModelAndView  privilegeGroupDelete(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/Privilege");
	}
	@RequestMapping("/assignPrivilege")
	public ModelAndView  assignPrivilege(ModelMap modelMap) 
	{
		return new ModelAndView("Admin/AssignPrivilege");
	}
	
	@RequestMapping(value = "/testonly", method = { RequestMethod.GET})
	 public String listBooksPOST( ModelMap modelMap,
			 @RequestBody  @RequestParam(value="datas" , required = false ) 
	 		String data)  
	{ 
		if(data==null)
			new IllegalArugumentthrowException("400","JSON");
		
		return "Succes";
	}




}
