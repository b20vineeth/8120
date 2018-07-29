package net.xin.web.packages.framework;

import java.util.Map;

public class PrivilegeValidation {
	
	Map<String,String> privilege;
	String key;
	int userGroupId;
	
	public Map<String, String> getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Map<String, String> privilege) {
		this.privilege = privilege;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}
	 
	 
	

}
