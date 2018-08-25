package net.xin.web.apps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 
import net.xin.web.apps.application.WebApp;
 

@Component
public class WebServiceImpl implements WebService {

	@Autowired
	private WebApp moduleApp;
 
	 


}
