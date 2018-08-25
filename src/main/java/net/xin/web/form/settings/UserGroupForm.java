package net.xin.web.form.settings;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import net.xin.web.packages.framework.Annotations;
import net.xin.web.utility.validation.RegexResource;
 
public class UserGroupForm  implements Serializable{

	 

	@Annotations(max=120,min=0,decode = true,callMethod=RegexResource.isNumber) 
	String  groupId;


	@Column(name = "module", length=25)
	private String  module;

	@Column(name = "group_Name", length=25)
	private String groupName;
	
	
	@Annotations(max=24,min=2,mandatory=true,callMethod=RegexResource.ALBHANUM) 
	private String moduleCode;
	@Annotations(max=1,min=1,callMethod=RegexResource.isStatus) 
	private String status="Y";
	
	private String updatedDate;
	private String createdDate;
	
	@Annotations(max=120,min=1,callMethod=RegexResource.date) 
	private String validityTo;
	@Annotations(max=10,min=10,callMethod=RegexResource.date) 
	private String validityFrom;
	
	
	private String createdBy;
	private String updatedBy;
	
	
	
	
	
	
	
	
	
	
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	 
	 



} 