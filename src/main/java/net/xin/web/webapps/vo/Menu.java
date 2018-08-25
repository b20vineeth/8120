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
@Table(name = "menu" )

public class Menu {


	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "menu_id")
	private Integer menuId ;

	@Column(name = "menu_name", length=120)
	private String moduleName;
	@Column(name = "parrent")
	private int parrent;
	@Column(name = "menu_code", length=25)
	private String menuCode;
	@Column(name = "menu_Label", length=70)
	private String menu_Label;
	@Column(name = "menu_Link", length=100)
	private String Link;
	@Column(name = "favicon", length=100)
	private String favicon;
	@Column(name = "count_status", length=1)
	private String countStatus="N";



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





	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenu_Label() {
		return menu_Label;
	}

	public void setMenu_Label(String menu_Label) {
		this.menu_Label = menu_Label;
	}

	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public String getFavicon() {
		return favicon;
	}
	public void setFavicon(String favicon) {
		this.favicon = favicon;
	}
	public String getCountStatus() {
		return countStatus;
	}
	public void setCountStatus(String countStatus) {
		this.countStatus = countStatus;
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
