package net.xin.web.service.settings;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.form.settings.PrivilegeTypeForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException; 

public interface PrivlegeTypeService {

	ValidationForm SavePrivilegeType(PrivilegeTypeForm form) throws PrevilegeException, BussinessException, BusinessViolatonException;

	 

}
