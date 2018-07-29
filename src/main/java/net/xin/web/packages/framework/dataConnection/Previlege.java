package net.xin.web.packages.framework.dataConnection;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.xin.web.packages.framework.PrivilegeValidation;

public class  Previlege {
	private Session session;
	private Transaction tx; 
	public Previlege(Session session2) {
		this.session=session2;
	}
	 
	public PrivilegeValidation fetch(PrivilegeValidation previlege)
	{
		
		String[] key=previlege.getKey().split(",");
		Map<String, String> keys = new HashMap<String, String>();
		for(String k :key)
		{
			keys.put(k, "Y");
		}
		
		previlege.setPrivilege(keys);
		
		return previlege;
	}
}
