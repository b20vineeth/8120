package net.xin.web.apps.persistence;

import org.hibernate.Session;

import net.xin.web.apps.vo.Module; 
 

public interface WebDao {
 

	void transaction(Session session);

	 
	 

}
