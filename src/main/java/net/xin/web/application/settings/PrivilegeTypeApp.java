package net.xin.web.application.settings;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.PrivilegeTypeForm;
import net.xin.web.form.settings.UserGroupForm;
import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException;

public interface PrivilegeTypeApp {   
	ValidationForm savePrivilegeType(PrivilegeTypeForm form) throws PrevilegeException,BussinessException, BusinessViolatonException;
 

	 
 
}
