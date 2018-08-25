package net.xin.web.packages.framework.dataConnection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UniqueValidation {
	 
	private Session session;
	private Transaction tx; 
	public UniqueValidation(Session session2) {
		this.session=session2;
	}
	 
	public boolean isUnique(String value,String column,String table)
	{
		String countQuery=" select count(*) count from "+table+" where "+column+"='"+value+"'";
		Query query=	 session.createSQLQuery("select  concat(count,'') as count  from ("+countQuery+") a ");
				 
		int count=0;
		String rowCount = "1";
		rowCount = (String) query.uniqueResult();
		if(rowCount.equals("0"))
		{
			return true;
		}
		return false;
		
	}
}
