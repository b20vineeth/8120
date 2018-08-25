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
@Table(name = "userGroup")

public class UserGroup  implements Serializable{

	@Id
	@GeneratedValue 
	@Column(name = "group_id")
	int  groupId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module", nullable = false)
	private Module  module;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private UserSetup  user;
	
	
	@Column(name = "group_Name", length=25)
	private String groupName;
 

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

	@Column(name = "description", length=250)
	private String description;
	
	
	
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getGroupId() {
		return groupId;
	}


	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}


	public Module getModule() {
		return module;
	}


	public void setModule(Module module) {
		this.module = module;
	}


	public UserSetup getUser() {
		return user;
	}


	public void setUser(UserSetup user) {
		this.user = user;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
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




 




} 