package net.xin.web.utility.beanCopy;
 
import java.util.Calendar;
import java.util.Date;

import net.xin.web.form.settings.UserSetupForm;
import net.xin.web.packages.framework.PasswordSecurity;
import net.xin.web.vo.settings.UserSetup;

public class BeanCopy {

	public UserSetup copyUserSetup(UserSetupForm form, UserSetup user)
	{

		user.setEmail(form.getEmail());
		user.setFirstName(form.getFirstName());
		user.setLastName(form.getLastName()); 
		user.setPrefixMob(form.getPrefixMob());
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
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 1); // to get previous year add -1
		Date nextYear = cal.getTime();
		user.setValidityTo(nextYear);
		return user;
	}
}
