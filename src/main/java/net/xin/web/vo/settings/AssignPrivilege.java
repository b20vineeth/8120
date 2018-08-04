package net.xin.web.vo.settings;

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
@Table(name = "assign_privilege")

public class AssignPrivilege  implements Serializable{

	@GeneratedValue 
	@Column(name = "assign_privilege_id")
	int  assignPrivilegeId;

	@EmbeddedId
	AssignPrivilegekey key;
 

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
	
	 

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getAssignPrivilegeId() {
		return assignPrivilegeId;
	}


	public void setAssignPrivilegeId(int assignPrivilegeId) {
		this.assignPrivilegeId = assignPrivilegeId;
	}


	public AssignPrivilegekey getKey() {
		return key;
	}


	public void setKey(AssignPrivilegekey key) {
		this.key = key;
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






}
@Embeddable
class AssignPrivilegekey implements Serializable {

	@Column(name = "module")
	private Integer  module;


	@Column(name = "Privilege_Group_Id")
	private Integer PrivilegeGroupId;

	@Column(name = "user_group_Id")
	private Integer userGroupId;

	AssignPrivilegekey(){}
	public AssignPrivilegekey(Integer  module,Integer userGroupId,Integer PrivilegeGroupId) {
		this.module=module;
		this.userGroupId=userGroupId;
		this.PrivilegeGroupId=PrivilegeGroupId;
	}
	public Integer getModule() {
		return module;
	}
	public void setModule(Integer module) {
		this.module = module;
	}
	public Integer getPrivilegeGroupId() {
		return PrivilegeGroupId;
	}
	public void setPrivilegeGroupId(Integer privilegeGroupId) {
		PrivilegeGroupId = privilegeGroupId;
	}
	public Integer getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}
	 






}
