package net.xin.web.packages.framework;

import java.util.ArrayList;
import java.util.List;

public class DateType {

	public static String defaultDate="yyyy-MM-dd HH:mm:ss.SSS";
	public static List<String> listDateFormats() {
		List<String> result = new ArrayList<String>();

		result.add("yyyy-MM-dd HH:mm:ss.SSS");	
		result.add("dd-MM-yy");	 
		result.add("dd-MM-yyyy");	 
		result.add("MM-dd-yyyy");	 
		result.add("yyyy-MM-dd");	 
		result.add("dd/MM/yy");	 
		result.add("dd/MM/yyyy");	 
		result.add("MM/dd/yyyy");	 
		result.add("yyyy/MM/dd");	 
		result.add("dd.MM.yy");	 
		result.add("dd.MM.yyyy");	 
		result.add("MM.dd.yyyy");	 
		result.add("yyyy.MM.dd");	
		result.add("yyyy-MM-dd HH:mm:ss");	  
		result.add("yyyy-MM-dd HH:mm:ss.SSSZ") ;
		result.add("EEEEE MMMMM yyyy HH:mm:ss.SSSZ"); 

		result.add("yyyy-MM-dd'T'HH:mm:ss'Z'");

		result.add("yyyy-MM-dd'T'HH:mm:ssz");
		result.add("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		result.add("EEE MMM d hh:mm:ss z yyyy");
		result.add("EEE MMM dd HH:mm:ss yyyy");
		result.add("EEEE, dd-MMM-yy HH:mm:ss zzz");
		result.add("EEE, dd MMM yyyy HH:mm:ss zzz");
		result.add("EEE, dd MMM yy HH:mm:ss z");
		result.add("EEE, dd MMM yy HH:mm z");
		result.add("EEE, dd MMM yyyy HH:mm:ss z");
		result.add("yyyy-MM-dd'T'HH:mm:ss");
		result.add("EEE, dd MMM yyyy HH:mm:ss Z");
		result.add("dd MMM yy HH:mm:ss z");
		result.add("dd MMM yy HH:mm z");
		result.add("'T'HH:mm:ss");
		result.add("'T'HH:mm:ssZZ");
		result.add("HH:mm:ss");
		result.add("HH:mm:ssZZ");

		result.add("yyyy-MM-dd hh:mm:ss");
		result.add("yyyy-MM-dd HH:mm:ss");
		result.add("yyyy-MM-dd'T'HH:mm:ssz");
		result.add("yyyy-MM-dd'T'HH:mm:ss");
		result.add("yyyy-MM-dd'T'HH:mm:ssZZ");

		result.add("dd.MM.yyyy hh:mm:ss");
		result.add("dd.MM.yyyy HH:mm:ss");
		result.add("dd.MM.yyyy'T'HH:mm:ssz");
		result.add("dd.MM.yyyy'T'HH:mm:ss");
		result.add("dd.MM.yyyy'T'HH:mm:ssZZ");
		return result;
	}

}
