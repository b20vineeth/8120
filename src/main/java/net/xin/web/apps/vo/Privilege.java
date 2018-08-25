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
@Table(name = "privilege")

public class Privilege  implements Serializable{

	@GeneratedValue 
	@Column(name = "privilege_id")
	int  privilegeId;

	@EmbeddedId
	privilegekey key;

	@Column(name = "description", length=250)
	private String description;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "privile_type", nullable = false)
	private PrivilegeType  type;
	
	
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


	 

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public PrivilegeType getType() {
		return type;
	}


	public void setType(PrivilegeType type) {
		this.type = type;
	}


	public int getPrivilegeId() {
		return privilegeId;
	}


	public void setPrivilegeId(int privilegeId) {
		this.privilegeId = privilegeId;
	}


	public privilegekey getKey() {
		return key;
	}


	public void setKey(privilegekey key) {
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
class privilegekey implements Serializable {

	@Column(name = "module", length=25)
	private Integer  module;

	@Column(name = "privilege_Code", length=250)
	private String privilegeCode;


	privilegekey(){}
	public privilegekey(Integer  module, String privilegeCode) {
		this.module=module;
		this.privilegeCode=privilegeCode;
	}
	 
	public Integer getModule() {
		return module;
	}
	public void setModule(Integer module) {
		this.module = module;
	}
	public String getPrivilegeCode() {
		return privilegeCode;
	}
	public void setPrivilegeCode(String privilegeCode) {
		this.privilegeCode = privilegeCode;
	}
	 




}
