package net.xin.web.apps.vo;

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
@Table(name = "module" , uniqueConstraints = { @UniqueConstraint(columnNames = { "module_code" }) })

public class Module {

	
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue 
	@Column(name = "module_id")
	private Integer moduleId ;

	@Column(name = "module_name", length=120)
	private String moduleName;
	
	@Column(name = "module_code", length=25)
	private String moduleCode;

	 
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
	
	
	
	 
	 
}
