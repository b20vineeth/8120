package net.xin.web.webapps.entity.Filter;

import java.util.ArrayList;
import java.util.List;

import net.xin.web.webapps.form.admin.LoginForm;

public class LoginFilter {
	String Username;
	String Password;
	String Captcha;
	String attempt="1";
	String redirectUrl;


	Boolean result=true;
	public List<Error> error;
	
	public LoginFilter(LoginForm login) {
		this.Username=login.getUsername();
		this.Password=login.getPassword();
		this.Captcha=login.getCaptcha();
		this.attempt=login.getAttempt();
		this.redirectUrl=login.getRedirectUrl();
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCaptcha() {
		return Captcha;
	}
	public void setCaptcha(String captcha) {
		Captcha = captcha;
	}
	public String getAttempt() {
		return attempt;
	}
	public void setAttempt(String attempt) {
		this.attempt = attempt;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public boolean isValidate()
	{
		error=new ArrayList<Error>();
		return true;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public List<Error> getError() {
		return error;
	}
	public void setError(List<Error> error) {
		this.error = error;
	}

}
