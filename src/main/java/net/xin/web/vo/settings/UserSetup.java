package net.xin.web.vo.settings;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usersetup" , uniqueConstraints = { @UniqueConstraint(columnNames = { "user_name" }) })

public class UserSetup {

	
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "user_id")
	private Integer userId ;

	@Column(name = "user_name", length=125)
	private String userName;
	
	@Column(name = "password", length=250)
	private String password;
	
	@Column(name = "mobile_number", length=12)
	private String mobileNumber;
	
	@Column(name = "email", length=100)
	private String email;
	
	@Column(name = "prefix_mob", length=5)
	private String prefixMob;
	
	
	@Column(name = "status", length=1)
	private String status="Y";

	@Column(name = "updated_date", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;
	
	@Column(name = "created_date", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name = "first_name", length=125)
	private String firstName;
	
	@Column(name = "last_name", length=125)
	private String lastName;
	
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


	public Date getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPrefixMob() {
		return prefixMob;
	}


	public void setPrefixMob(String prefixMob) {
		this.prefixMob = prefixMob;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
