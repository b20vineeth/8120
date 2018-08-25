package net.xin.web.utility.validation;

public class RegexResource {

	public static final String ALBHANUM_PATTERN= "^[a-zA-Z0-9]{1,150}$";
	public static final String  URL_PATTERN="^[a-z0-9_-]{3,15}$";
	public static final String  ALBHACOMMASPACE_PATTERN= "^[a-zA-Z0-9-,_ ]*$";
	public static final String IMAGE_PATTERN = "([^\\s]+(\\.(?i)(/bmp|jpg|gif|png))$)";
	public static final String LANG_PATTERN = "ML,TN,TE,KA,BO,HO";
	public static final String TYPE_PATTERN = "P,L,C,N";
	public static final String URL_REGEX = "([^=\\s]+)=([^=\\s]*(?:\\s+[^=\\s]+)*)(?!\\S)";
	public static final String CATEGORY_QUERY_FORMAT = "category_name=Title,category_type=type,"
			+ "category_desc=desc,lang=Languge,category_id=id,created_date=createdDate,updated_date=updatedDate";
	public static final String DateValidation = "\\d{4}-\\d{2}-\\d{2}";
	public static final String NUM_ONLY= "^[a-zA-Z0-9]{2,30}$";
	public static final String Email_pattern =  "^[a-zA-Z0-9]{2,30}$";
	public static final String Date_pattern = "^[a-zA-Z0-9]{2,30}$";
	
	
	public static final String EMAIL_VALIDATE = "isEmail";
	public static final String isNumber = "isNumber";
	public static final String date = "isDate";
	public static final String ALBHANUM = "isAlbhaNum";
	public static final String isStatus = "isStatusYorN";
	public static final String USERNAME_UNIQUE = "UserSetup,userName";
	
 

}
