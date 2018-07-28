package net.xin.web.form.settings;

import java.util.Date;

import javax.persistence.Column;
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
import net.xin.web.vo.settings.UserSetup;

public class ModuleForm {


	@Annotations(max=16,min=0, matcher = RegexResource.ALBHANUM_PATTERN) 
	private String moduleId ;
	
	@Annotations(max=24,min=2,regex=RegexResource.ALBHANUM_PATTERN) 
	private String moduleName;
	
	@Annotations(max=24,min=2,regex=RegexResource.ALBHANUM_PATTERN) 
	private String moduleCode;
	
	@Annotations(max=1,min=1,regex=RegexResource.ALBHANUM_PATTERN) 
	private String status="Y";
	
	@Annotations(regex=RegexResource.DateValidation)
	private String updatedDate;
	
	@Annotations(regex=RegexResource.DateValidation)
	private String createdDate;
	
	@Annotations(regex=RegexResource.DateValidation)
	private String validityTo;
	
	@Annotations(regex=RegexResource.DateValidation)
	private String validityFrom;

	@Annotations(max=120,min=0) 
	private String moduleIds ;

	private boolean result;
	private String output;
	
	
	
	 
	
	
	
	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
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

	public String getModuleIds() {
		return moduleIds;
	}

	public void setModuleIds(String moduleIds) {
		this.moduleIds = moduleIds;
	}


 






}
