package net.xin.web.service.settings;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussinessException;
import net.xin.web.packages.framework.Exception.PrevilegeException; 

public interface ModuleService {

	String save();

	ValidationForm moduleSave(ModuleForm module, UserBean user) throws BussinessException, BusinessViolatonException, PrevilegeException;

	ValidationForm moduleGetById(String id, UserBean user) throws BussinessException,PrevilegeException;

}
