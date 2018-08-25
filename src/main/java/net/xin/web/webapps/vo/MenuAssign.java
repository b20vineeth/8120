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

import net.xin.web.webapps.vo.UserSetup;

@Entity
@Table(name = "menu_assign")

public class MenuAssign {


	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "menu_assign_id")
	private Integer menuAssignId ;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Menu_id", nullable = false)
	private Menu  menu;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_group", nullable = false)
	private UserGroup userGroup;


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



	public Integer getMenuAssignId() {
		return menuAssignId;
	}



	public void setMenuAssignId(Integer menuAssignId) {
		this.menuAssignId = menuAssignId;
	}



	public Menu getMenu() {
		return menu;
	}



	public void setMenu(Menu menu) {
		this.menu = menu;
	}



	public UserGroup getUserGroup() {
		return userGroup;
	}



	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
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
