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
@Table(name = "user_setup" , uniqueConstraints = { @UniqueConstraint(columnNames = { "username" ,"email"}) })



public class UserSetup {


	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "menu_id")
	private Integer menuId ;





	@Column(name = "username", length=120)
	private String username;
	@Column(name = "email", length=120)
	private String Email;
	@Column(name = "first_name", length=120)
	private String Firstname;
	@Column(name = "last_name", length=120)
	private String lastname;

	@Column(name = "password", length=120)
	private String password;


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



	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
