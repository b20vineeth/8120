package net.xin.web.packages.framework;

import java.util.Random;

 

 

public class Util
{ 
    public Integer generateRandomNumber(int minimum ,int maximum)
	{
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int randomNum =  rn.nextInt(range) + minimum;
		return randomNum;

	}
	 
	public int getTotalPage(String totalRecord) {
		
		/*try
		{
		 if(Integer.parseInt(totalRecord)>0)
		  {
			int temp=Integer.parseInt(totalRecord);
			 int reminder=temp%UserSetupResource.PAGE_LIMIT;
			 temp=temp-reminder;
			 int page=temp/UserSetupResource.PAGE_LIMIT;
			 if(reminder>0)
			 {
				 page=page+1;
			 }
			 return page;
		  }
		}
		catch(Exception e)
		{
			
		}*/
		return 0;
	}
	
}
