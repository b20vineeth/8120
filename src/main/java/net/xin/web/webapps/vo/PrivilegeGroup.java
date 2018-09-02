package net.xin.web.webapps.vo;

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

import net.xin.web.webapps.vo.PrivilegeGroup;

@Entity
@Table(name = "privilege_group" , uniqueConstraints = { @UniqueConstraint(columnNames = { "privilege_group_code" }) })


public class PrivilegeGroup {


	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "privilege_group_id")
	private Integer privilegeGroupId ;







	@Column(name = "privilege_group_Name", length=120)
	private String privilegeGroupName;
	@Column(name = "privilege_group_code", length=120)
	private String privilegeGroupCode;





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
	public Integer getPrivilegeGroupId() {
		return privilegeGroupId;
	}
	public void setPrivilegeGroupId(Integer privilegeGroupId) {
		this.privilegeGroupId = privilegeGroupId;
	}
	public String getPrivilegeGroupName() {
		return privilegeGroupName;
	}
	public void setPrivilegeGroupName(String privilegeGroupName) {
		this.privilegeGroupName = privilegeGroupName;
	}
	public String getPrivilegeGroupCode() {
		return privilegeGroupCode;
	}
	public void setPrivilegeGroupCode(String privilegeGroupCode) {
		this.privilegeGroupCode = privilegeGroupCode;
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
