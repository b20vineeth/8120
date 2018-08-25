package net.xin.web.webapps.vo;

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

@Entity
@Table(name = "privilege_Group")

public class PrivilegeGroup  implements Serializable{
	@Id
	@GeneratedValue 
	@Column(name = "PrivilegeGroup_id")
	int  PrivilegeGroupId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module", nullable = false)
	private Module  module;


	@Column(name = "Privilege_Group_Code", length=25)
	private String PrivilegeGroupCode;



	@Column(name = "Privilege_Group_name", length=25)
	private String PrivilegeGroupName;

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
	private Date createDate;

	@Column(name = "description", length=250)
	private String description;

	public int getPrivilegeGroupId() {
		return PrivilegeGroupId;
	}

	public void setPrivilegeGroupId(int privilegeGroupId) {
		PrivilegeGroupId = privilegeGroupId;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public String getPrivilegeGroupCode() {
		return PrivilegeGroupCode;
	}

	public void setPrivilegeGroupCode(String privilegeGroupCode) {
		PrivilegeGroupCode = privilegeGroupCode;
	}

	public String getPrivilegeGroupName() {
		return PrivilegeGroupName;
	}

	public void setPrivilegeGroupName(String privilegeGroupName) {
		PrivilegeGroupName = privilegeGroupName;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

 



} 