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

@Entity
@Table(name = "menu_group")
public class MenuGroup {

	
	@Id
	@GeneratedValue 
	@Column(name = "menu_group_id")
	private Integer menuGroupId ;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module", nullable = false)
	private Module  module;
	 
 
	@Column(name = "menuGroup_Code", length=250)
	private String menuCode;

	@Column(name = "menuGroup_name", length=250)
	private String menuGroupName;

	

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



	public Integer getMenuGroupId() {
		return menuGroupId;
	}



	public void setMenuGroupId(Integer menuGroupId) {
		this.menuGroupId = menuGroupId;
	}



	public Module getModule() {
		return module;
	}



	public void setModule(Module module) {
		this.module = module;
	}



	public String getMenuCode() {
		return menuCode;
	}



	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}



	public String getMenuGroupName() {
		return menuGroupName;
	}



	public void setMenuGroupName(String menuGroupName) {
		this.menuGroupName = menuGroupName;
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
