package net.xin.web.service.settings;

import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;

public interface ModuleService {

	String save();

	ValidationForm moduleSave(ModuleForm module, UserBean user);

}
