package net.xin.web.usermanage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import net.xin.web.packages.framework.UserBean;

 
 

public class UserManage {

	public boolean status=false;
	public String getUserCode(SessionUtil session) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidAlgorithmParameterException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, IOException
	{
		Cookie[] cookies = session.getRequest().getCookies();
		int i = 0;String code="E";
		if(cookies!=null)
			for (Cookie cookie : cookies ) {
				if(cookie.getName().equals("UserCode"))
				{
					code= new net.xin.web.packages.framework.PasswordSecurity().decrypt(cookie.getValue());
					status=true;
				}
				i++;
			}
		return code;

	}
	public boolean setUserCode(SessionUtil sessionutil, String userName) {
		 
		try
		{
			this.deleteAllCookie(sessionutil);
			Cookie newCookie = new Cookie("UserCode", new net.xin.web.packages.framework.PasswordSecurity().encrypt(userName));
			newCookie.setMaxAge(24 * 60 * 60);
			newCookie.setPath("/");
			sessionutil.getResponse().addCookie(newCookie);
			 return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	private boolean deleteAllCookie(SessionUtil session) {
		try
		{
			Cookie[] cookies = session.getRequest().getCookies();
			if(cookies!=null)
				for (Cookie cookie : cookies) {
					cookie.setMaxAge(0);
					cookie.setValue(null);
					cookie.setPath("/");
					session.getResponse().addCookie(cookie);
				}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public UserBean getUserBean()
	{
		return null;
		/*String username=this.getUserName();
		userManage=new UserManage();
		sessionutil=new SessionUtil();
		sessionutil.setRequest(request);
		sessionutil.setResponse(response);
		sessionutil.setSession(session);
		user = (UserBean) session.getAttribute("UserSetup");
		if(user==null)
		{
			user=webDao.getUserDetailsByCode(username);

			if(user!=null)
			{

				if(userManage.setUserCode(sessionutil,user.getUser().getUserName()))
				{
					session.setAttribute("UserSetup",user);

				}

			}

		}*/
		 


	}
	public boolean isLogin()
	{
		return status;
	/*	userManage=new UserManage();
		sessionutil=new SessionUtil();
		sessionutil.setRequest(request);
		sessionutil.setResponse(response);
		sessionutil.setSession(session);
		HttpSession session = request.getSession(true);
		boolean result=false;
		try {
			String userCode=userManage.getUserCode(sessionutil);
			if(userManage.status)
			{	
				result=true;
			}
		}catch(Exception e)
		{

		}*/
	 
	}
	private String  getUserName()
	{
		return null;
		/*userManage=new UserManage();
		sessionutil=new SessionUtil();
		sessionutil.setRequest(request);
		sessionutil.setResponse(response);
		sessionutil.setSession(session);
		HttpSession session = request.getSession(true);
		String userCode ="";
		try {
			userCode=userManage.getUserCode(sessionutil);

		}catch(Exception e)
		{

		}
		return userCode;*/
	}
	
	
	
}
