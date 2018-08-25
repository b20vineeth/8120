package net.xin.web.form.settings;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import net.xin.web.packages.framework.Annotations;
import net.xin.web.utility.validation.RegexResource;

 
public class UserSetupForm {
 
 
	@Annotations(max=120,min=0,decode = true,callMethod=RegexResource.isNumber) 
	private String userId ;

	@Annotations(max=50,min=2,callMethod=RegexResource.ALBHANUM,mandatory=true,isUnique=RegexResource.USERNAME_UNIQUE) 
	private String userName;
	
	@Annotations(max=150,min=2,mandatory=true) 
	private String password;
	 
	@Annotations(max=12,min=9,callMethod=RegexResource.isNumber) 
	private String mobileNumber;
	
	@Annotations(max=150,min=9,callMethod=RegexResource.EMAIL_VALIDATE,mandatory=true) 
	private String email;
	
	@Annotations(max=4,min=2,callMethod=RegexResource.isNumber) 
	private String prefixMob;
	
	
	@Annotations(max=1,min=1,callMethod=RegexResource.isStatus) 
	private String status="Y";
	
	

	 private String updatedDate;
	
	 private String createdDate;

	@Annotations(max=120,min=3) 
	private String firstName;
	
	@Annotations(max=120,min=1,callMethod=RegexResource.ALBHANUM) 
	private String lastName;
	
	
	@Annotations(max=120,min=1,callMethod=RegexResource.date) 
	private String validityTo;
 
	
	@Annotations(max=10,min=10,callMethod=RegexResource.date) 
	private String validityFrom;


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPrefixMob() {
		return prefixMob;
	}


	public void setPrefixMob(String prefixMob) {
		this.prefixMob = prefixMob;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}


	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getValidityTo() {
		return validityTo;
	}


	public void setValidityTo(String validityTo) {
		this.validityTo = validityTo;
	}


	public String getValidityFrom() {
		return validityFrom;
	}


	public void setValidityFrom(String validityFrom) {
		this.validityFrom = validityFrom;
	}
	
	 
	
}
