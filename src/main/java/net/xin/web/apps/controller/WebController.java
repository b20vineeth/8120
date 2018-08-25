package net.xin.web.apps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import net.xin.web.apps.service.WebService; 

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
	
	
	@RequestMapping(value="/")
	@ResponseBody
	public ModelAndView home(){
		return new ModelAndView("Screen/HomePage"); 
	}
	@RequestMapping(value="/{param1}")
	@ResponseBody
	public ModelAndView oneParameter(@PathVariable("param1") String param1){
		return new ModelAndView("Screen/OneParameter"); 
	}

	@RequestMapping(value="/{param1}/{param2}")
	@ResponseBody
	public ModelAndView twoParameter(@PathVariable("param1") String param1,
			@PathVariable("param2") String param2){
		return new ModelAndView("Screen/TwoParameter"); 
	}
	
	 
	@RequestMapping(value="/{param1}/{param2}/{param3}")
	@ResponseBody
	public ModelAndView threeParameter(@PathVariable("param1") String param1,
			@PathVariable("param2") String param2,
			@PathVariable("param3") String param3){
		return new ModelAndView("Screen/ThreeParameter"); 
	}
	@RequestMapping(value="/{param1}/{param2}/{param3}/{param4}")
	@ResponseBody
	public ModelAndView fourParameter(@PathVariable("param1") String param1,
			@PathVariable("param2") String param2,
			@PathVariable("param3") String param3,
			@PathVariable("param4") String param4){
		return new ModelAndView("Screen/FourParameter"); 
	}
	@RequestMapping(value="/{param1}/{param2}/{param3}/{param4}/{param5}")
	@ResponseBody
	public ModelAndView fiveParameter(@PathVariable("param1") String param1,
			@PathVariable("param2") String param2,
			@PathVariable("param3") String param3,
			@PathVariable("param4") String param4,
			@PathVariable("param5") String param5){
		return new ModelAndView("Screen/FiveParameter"); 
	}
}
