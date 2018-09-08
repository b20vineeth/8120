package net.xin.web.utility.Query;

public class AuthQueryResource {

	public static final String AUTHENTICATION_QUERY = "From UserSetup u where  "
			+ "(u.username=:username AND u.password=:password1) or  (u.email=:email AND u.password=:password2)";
	public static final String FETCH_BY_USER_ID = null;

}
