package net.xin.web.application.settings;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussineException; 

public interface ModuleApp {

	 
	String save();

	ValidationForm moduleSave(ModuleForm module, UserBean user) throws BussineException, BusinessViolatonException;

	ValidationForm moduleList(String id, UserBean user) throws BussineException;
	
}
