package net.xin.web.packages.framework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;



public class FormValidation {



	public ValidationForm validate(Object form)
	{

		ValidationForm forms=new ValidationForm();
		boolean formResult=true;
		try{

			List<ValidationItem> list=new ArrayList<ValidationItem>(); 
			ValidationItem item;
			Field[] fields = form.getClass().getDeclaredFields(); 
			Class tClass = form.getClass();

			String response;
			for( int i = 0; i<fields.length; i++ ){
				boolean result=true;
				item= new ValidationItem();
				Annotations annotation = (Annotations)fields[i].getAnnotation(Annotations.class);
				if(annotation!= null ){

					Method gs1Method = tClass.getMethod("get"+StringUtils.capitalize(fields[i].getName()), new Class[] {});
					String value = (String) gs1Method.invoke(form, new Object[] {});
					item.setDataInput(StringUtils.capitalize(fields[i].getName()));
					item.setValue(value); 
					boolean isregexValidate=true;

					if(isregexValidate && annotation.mandatory())
					{
						if(value==null || value.trim().length()==0 )
						{
							isregexValidate=false;
							item.setMsg("Mandatory Field");
							result=false;
						}
					}
					if(annotation.decode())
					{
						if(value!=null)
						{
							value= new PasswordSecurity().decrypt(value);
							if(value==null)
							{	
								isregexValidate=false;
								item.setMsg("encryption Failed");
								result=false;
							}

						}
					}

					if(annotation.mandatory() && isregexValidate)
					{
						response=new Validation().validateLength(value,annotation.min() ,annotation.max());
						if(response.equals("MIN"))
						{
							item.setMsg("Poor Strength");
							result=false;
						}
						else if(response.equals("MAX"))
						{
							item.setMsg("Too long");
							result=false;
						}

					}
					else if(value!=null && value.length()>0 && isregexValidate && !annotation.mandatory())
					{
						response=new Validation().validateLength(value,annotation.min() ,annotation.max());
						if(response.equals("MIN"))
						{
							item.setMsg("Poor Strength");
							result=false;
						}
						else if(response.equals("MAX"))
						{
							item.setMsg("Too long");
							result=false;
						}
					}

					if(annotation.callMethod().trim().length()>0 && isregexValidate)
					{
						if(value!=null)
						{
							boolean responses=new Validation().callMethod(value,annotation.callMethod());
							if(!responses)
							{
								item.setMsg("Invalid");
								result=false;
							}
							 
						}

					}



				}
				System.out.println(StringUtils.capitalize(fields[i].getName())+"-"+item.getMsg()+"-"+result+"");
				list.add(item);
				if(result==false)
					forms.setResult(result);
				
				

			}
			//forms.item=new List<ValidationItem>();
	 	forms.setItem(list);
		}
		catch(Exception e){
			forms.setResult(false);
		} 
		return forms;

	}


}
