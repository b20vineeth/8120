package net.xin.web.service.settings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component; 

import net.xin.web.application.settings.ModuleApp;
import net.xin.web.form.settings.ModuleForm;
import net.xin.web.packages.framework.FormValidation;
import net.xin.web.packages.framework.UserBean;
import net.xin.web.packages.framework.ValidationForm;
import net.xin.web.packages.framework.Exception.BusinessViolatonException;
import net.xin.web.packages.framework.Exception.BussineException;

@Component
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleApp moduleApp;
	@Override
	public String save() {

		return moduleApp.save();
	}
	@Override
	public ValidationForm moduleSave(ModuleForm module, UserBean user) throws BussineException, BusinessViolatonException {

		 
			try
			{
				ValidationForm obj=new FormValidation().validate(module);
				if(obj.isResult())
				{
					return moduleApp.moduleSave(module,user);
				}
				else
				{
					return obj; 
				}

			}
			catch (BusinessViolatonException e)
			{
				throw new BusinessViolatonException(e.getMessage()); 
			}
			 catch (Exception e)
			{
				throw new BussineException(e.getMessage());  
			}
		 

	}
	@Override
	public ValidationForm moduleList(String id, UserBean user) throws BussineException {
		 
		return moduleApp.moduleList(id,user);
		 
	}
}
