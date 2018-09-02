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

import net.xin.web.webapps.vo.AssignPrivilegeGroup;

@Entity
@Table(name = "assign_privilege_group" )

public class AssignPrivilegeGroup {


	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "Assign_Privilege_id")
	private Integer AssignPrivilegeId ;
 
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "privilege_group_id", nullable = false)
	private PrivilegeGroup  group;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "privilege_id", nullable = false)
	private Privilege  privilege;
	
	
	

	
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
	public Integer getAssignPrivilegeId() {
		return AssignPrivilegeId;
	}
	public void setAssignPrivilegeId(Integer assignPrivilegeId) {
		AssignPrivilegeId = assignPrivilegeId;
	}
	public PrivilegeGroup getGroup() {
		return group;
	}
	public void setGroup(PrivilegeGroup group) {
		this.group = group;
	}
	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
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
