package net.xin.web.webapps.form.admin;

public class LoginForm {

	String Username;
	String Password;
	String Captcha;
	String attempt="1";
	String redirectUrl;


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

	 

}
