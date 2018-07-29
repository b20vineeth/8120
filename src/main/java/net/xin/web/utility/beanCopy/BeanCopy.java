package net.xin.web.utility.beanCopy;

import java.util.Calendar;
import java.util.Date;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.vo.settings.Module;
import net.xin.web.vo.settings.UserSetup;

public class BeanCopy {

	public UserSetup copyUserSetup(UserSetupForm form, UserSetup user)
	{

		user.setEmail(form.getEmail());
		user.setFirstName(form.getFirstName());
		user.setLastName(form.getLastName()); 
		user.setPrefixMob(form.getPrefixMob());
		user.setMobileNumber(form.getMobileNumber());

		user.setUpdatedDate(new Date());
		return user;

	}

	public UserSetup copyUserSetup(UserSetupForm form) {

		UserSetup user=new UserSetup();
		user.setEmail(form.getEmail());
		user.setFirstName(form.getFirstName());
		user.setLastName(form.getLastName()); 
		user.setPrefixMob(form.getPrefixMob());
		user.setUpdatedDate(new Date());
		user.setCreatedDate(new Date());
		user.setValidityFrom(new Date());
		user.setUserName(form.getUserName());
		user.setMobileNumber(form.getMobileNumber());
		user.setPassword(form.getPassword());
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 1); // to get previous year add -1
		Date nextYear = cal.getTime();
		user.setValidityTo(nextYear);
		return user;
	}

	public Module copyModule(ModuleForm module, Module moduleVo) {

		moduleVo.setModuleCode(module.getModuleCode());
		moduleVo.setModuleName(module.getModuleName());
		moduleVo.setUpdatedDate(new Date());
		return moduleVo;
	}

	public Module copyModule(ModuleForm module) {
		Module moduleVo=new Module();

		moduleVo.setModuleCode(module.getModuleCode());
		moduleVo.setModuleName(module.getModuleName());
		moduleVo.setUpdatedDate(new Date());
		moduleVo.setUpdatedDate(new Date());
		moduleVo.setValidityFrom(new Date());
		moduleVo.setCreatedDate(new Date());
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 1); // to get previous year add -1
		Date nextYear = cal.getTime();
		moduleVo.setValidityTo(nextYear);
		return moduleVo;
	}

	public ModuleForm copyModuleFormToModule(Module moduleVo) {

		ModuleForm form =new ModuleForm();
		form.setCreatedDate(moduleVo.getCreatedDate().toString());
		form.setModuleCode(moduleVo.getModuleCode());
		form.setModuleId(moduleVo.getModuleId().toString());
		form.setModuleName(moduleVo.getModuleName());
		form.setStatus(moduleVo.getStatus());
		form.setUpdatedDate(moduleVo.getUpdatedDate().toString());
		form.setValidityFrom(moduleVo.getValidityFrom().toString());
		form.setValidityTo(moduleVo.getValidityTo().toString());
		form.setCreatedBy(moduleVo.getUser().getFirstName()+" "
				+moduleVo.getUser().getLastName()+"-"
				+moduleVo.getUser().getUserName());

		form.setUpdatedBy(moduleVo.getUpdatedBy().getFirstName()+" "
				+moduleVo.getUpdatedBy().getLastName()+"-"
				+moduleVo.getUpdatedBy().getUserName()); 

		return form;
	}
}
