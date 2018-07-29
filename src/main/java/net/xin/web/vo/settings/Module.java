package net.xin.web.vo.settings;

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

import net.xin.web.vo.settings.UserSetup;

@Entity
@Table(name = "module" , uniqueConstraints = { @UniqueConstraint(columnNames = { "module_code" }) })

public class Module {

	
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "module_id")
	private Integer moduleId ;

	@Column(name = "module_name", length=25)
	private String moduleName;
	
	@Column(name = "module_code", length=25)
	private String moduleCode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private UserSetup  user;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "updated_by", nullable = false)
	private UserSetup  updatedBy;
	 
	@Column(name = "status", length=1)
	private String status="Y";

	@Column(name = "updated_date", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;
	
	@Column(name = "validity_to", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date validityTo;
 
	
	@Column(name = "validity_From", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date validityFrom;
	
	
	
	@Column(name = "created_date", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public UserSetup getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(UserSetup updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
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

	public UserSetup getUser() {
		return user;
	}

	public void setUser(UserSetup user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getValidityTo() {
		return validityTo;
	}

	public void setValidityTo(Date validityTo) {
		this.validityTo = validityTo;
	}

	public Date getValidityFrom() {
		return validityFrom;
	}

	public void setValidityFrom(Date validityFrom) {
		this.validityFrom = validityFrom;
	}

	 

	 
	
	 
}
