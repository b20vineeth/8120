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
@Table(name = "Privilege_type" , uniqueConstraints = { @UniqueConstraint(columnNames = { "Privilege_type_code" }) })

public class PrivilegeType {

	
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "Privilege_type_id")
	private Integer privilegeTypeId ;

	@Column(name = "Privilege_type_code", length=25)
	private String privilegeTypeCode;
	
	@Column(name = "Privilege_type_name", length=120)
	private String privilegeTypeName;
	
	@Column(name = "description", length=250)
	private String description;

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


 



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Integer getPrivilegeTypeId() {
		return privilegeTypeId;
	}



	public void setPrivilegeTypeId(Integer privilegeTypeId) {
		this.privilegeTypeId = privilegeTypeId;
	}



	public String getPrivilegeTypeCode() {
		return privilegeTypeCode;
	}



	public void setPrivilegeTypeCode(String privilegeTypeCode) {
		this.privilegeTypeCode = privilegeTypeCode;
	}



	public String getPrivilegeTypeName() {
		return privilegeTypeName;
	}



	public void setPrivilegeTypeName(String privilegeTypeName) {
		this.privilegeTypeName = privilegeTypeName;
	}



	public UserSetup getUser() {
		return user;
	}



	public void setUser(UserSetup user) {
		this.user = user;
	}



	public UserSetup getUpdatedBy() {
		return updatedBy;
	}



	public void setUpdatedBy(UserSetup updatedBy) {
		this.updatedBy = updatedBy;
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



	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	 

	 
	
	 
}
