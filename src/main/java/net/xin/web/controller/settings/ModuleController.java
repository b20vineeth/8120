package net.xin.web.controller.settings;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody; 

import com.google.gson.Gson;

import net.xin.web.form.settings.ModuleForm; 
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException; 
import net.xin.web.service.settings.ModuleService;
import net.xin.web.vo.settings.UserSetup;

@Controller
public class ModuleController   {

	@Autowired
	protected ModuleService service; 
	Gson gson;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;
	@RequestMapping("/module.save")
	@ResponseBody
	public String  moduleSave(ModelMap modelMap) 
	{
		try
		{
			UserBean user =new UserBean();
			String data=null;
			UserSetup usersetup=new UserSetup();
			usersetup.setUserId(1);
			user.setUserSetup(usersetup);
			ModuleForm module=new ModuleForm(); 
			module.setModuleName("Picmass");
			module.setModuleCode("P2");
			gson= new Gson();
			String datas = gson.toJson(module);
			module= gson.fromJson(datas,ModuleForm.class);
			System.out.println(datas);

			ValidationForm	form=service.moduleSave(module,user);
			datas=gson.toJson(form.isResult());
			System.out.println(datas);
			return data; 
		}
		catch (BusinessViolatonException e)
		{
			e.printStackTrace();
			return "Error";
		}
		catch(Exception e)
		{
			return "Error";
		}

	}

	@RequestMapping("/module.edit")
	public String  moduleEdit(ModelMap modelMap) 
	{
		UserBean user =new UserBean();
		String data=null;
		if(user.getUserSetup()!=null)
		{
			ModuleForm module=new ModuleForm();


			try {
				ValidationForm	form=service.moduleSave(module,user);
			} 
			catch (BusinessViolatonException e)
			{
				System.out.println("Unique Violation "+e);
			}
			catch(PrevilegeException e)
			{
				e.printStackTrace();
			}
			catch (BussinessException e) {

				e.printStackTrace();
			}

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
		ValidationForm form =new ValidationForm();
		form.setSearchKey("module");

		if(user.getUserSetup()!=null)
		{
			ModuleForm module=new ModuleForm();

			try {
				form=service.moduleList(module,user);
			} catch ( Exception  e) {

				e.printStackTrace();
			}

		}
		else
		{

		}
		return ""; 

	} 
	@RequestMapping(value="/module.get",method=RequestMethod.GET)
	@ResponseBody
	public String  moduleGet(ModelMap modelMap,@RequestBody  @RequestParam("datas") String id)  
	{
		UserBean user =new UserBean();
		ValidationForm form = null;
		try {
			form = service.moduleGetById(id,user);
		} catch (PrevilegeException e) {

			e.printStackTrace();
		}
		catch (BussinessException e) {

			e.printStackTrace();
		}

		String data=gson.toJson(form);
		System.out.println(data);
		return id;

	}


}
