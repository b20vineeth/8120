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
@Table(name = "userGroup")

public class UserGroup  implements Serializable{

	@GeneratedValue 
	@Column(name = "group_id")
	int  groupId;

	@EmbeddedId
	Groupkey key;

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





	public Groupkey getKey() {
		return key;
	}


	public void setKey(Groupkey key) {
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




}
@Embeddable
class Groupkey implements Serializable {

	@Column(name = "module", length=25)
	private String  module;

	@Column(name = "group_Name", length=25)
	private String groupName;


	Groupkey(){}
	public Groupkey(String  module, String groupName) {
		this.module=module;
		this.groupName=groupName;
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
	 




}
