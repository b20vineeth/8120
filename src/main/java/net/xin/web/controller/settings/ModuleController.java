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
import com.xin.web.dao.WebDao;
import com.xin.web.utility.resource.Util;
import com.xin.web.utility.userManage.UserBean;

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
	@RequestMapping("/module")
	public String  indexHandler(ModelMap modelMap) 
	{
		
		String data=service.save();
		return data; 
		 
		 

	}

}
