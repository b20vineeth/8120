package net.xin.web.packages.framework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.validator.routines.DateValidator;
import org.apache.commons.validator.routines.EmailValidator;

import net.xin.web.utility.validation.RegexResource;

public class Validation {
	private Pattern pattern;
	private Matcher matcher;

	public boolean isAlbhaNumeric(String Key)
	{
		pattern = Pattern.compile(RegexResource.ALBHANUM_PATTERN);
		matcher = pattern.matcher(Key);
		return matcher.matches();

	}
	public boolean isNumber(String Key)
	{
		try
		{
			long number = Long.parseLong(Key.trim());
		 
			return true;
		}
		catch(Exception e)
		{
			return false;
		}

	}
	public boolean isUrl(String Key)
	{
		if(Key.length()>0)
		{
			pattern = Pattern.compile(RegexResource.URL_PATTERN);
			matcher = pattern.matcher(Key);
			return matcher.matches();
		}
		else
			return false;

	}
	public boolean isAlbhaNumericCommaOnly(String Key)
	{
		pattern = Pattern.compile(RegexResource.ALBHACOMMASPACE_PATTERN);
		matcher = pattern.matcher(Key);
		return matcher.matches();

	}
	public boolean isValidType(String Key)
	{
		if(RegexResource.TYPE_PATTERN.contains(Key))
			return true;
		else 
			return false;
	}
	public boolean isValidLanguage(String Key)
	{
		if(RegexResource.LANG_PATTERN.contains(Key))
			return true;
		else 
			return false;
	}
	public boolean isThumb(String Key)
	{
		pattern = Pattern.compile(RegexResource.IMAGE_PATTERN);
		matcher = pattern.matcher(Key);
		return matcher.matches();
	}

	public boolean validateMatcher(String matcher, String value,boolean Split, String string) {
		boolean matchResponse=true;
		if(Split)
		{
			String[] datas=value.split(string);

			for(String s:datas)
			{
				if(!matcher.contains(s))
					matchResponse=false;

			}
		}
		else
		{
			if(!matcher.contains(value))
				matchResponse=false;
		}
		return matchResponse;
	}
	public boolean validateRegex(String regex, String value, boolean Split, String string) {
		boolean matchResponse=true;
		pattern = Pattern.compile(regex);
		if(Split)
		{
			String[] datas=value.split(string);
			for(String s:datas)
			{
				matcher = pattern.matcher(s);
				if(!matcher.matches())
					matchResponse=false;
			}
		}
		else
		{
			matcher = pattern.matcher(value);
			if(!matcher.matches())
				matchResponse=false;
		}

		return matchResponse;
	}
	public String validateLength(String value,int min,int max)
	{
		if(value.length()<min) {  return "MIN"; }
		else if(max!=5000 && value.length()>max) { return "MAX"; }
		else { return "OK"; }
	}
	public boolean callMethod(String value, String callMethod) 
	{
		if(callMethod.equals("isEmail"))
		{
			EmailValidator eValidator = EmailValidator.getInstance();
			return eValidator.isValid(value);
		}
		else if(callMethod.equals("isNumber"))
		{
			return isNumber(value);
		}
		else if(callMethod.equals("isDate"))
		{
			DateValidator validator=new DateValidator(); 
			for (String format :DateType.listDateFormats()) {
				if (validator.isValid(value, format)) {
					return true;
				}
			}
		}
		else if(callMethod.equals("isAlbhaNum"))
		{
			return isAlbhaNumeric(value);

		}
		else if(callMethod.equals("isStatusYorN"))
		{
			if(value.equals("Y")||value.equals("N"))
				return true;
			else
				return false;
		}

		return false;


	}

}
