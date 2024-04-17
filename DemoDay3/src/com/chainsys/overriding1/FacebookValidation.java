package com.chainsys.overriding1;
public class FacebookValidation 
{
	public static void validationForEmail(String email)
	{
		FacebookVersion1 v1=new FacebookVersion1();
		String regex="(^[a-z])[a-z0-9]+[@][a-z0-9]+\\.[a-zA-Z]{2,}";
		if(email.matches(regex))
		{
			System.out.println("Valid email");
		}
		else
		{
			System.out.println("*Email should start with LowerCase,Don't use UpperCase inbetween also*");
			v1.login();
		}
	}
	public static void validationForPhoneNo(String stringPhoneNo)
	{
		FacebookVersion2 v2=new FacebookVersion2();
		String regex="(91|0)?[6-9][0-9]{9}$";
		if(stringPhoneNo.matches(regex))
		{
			System.out.println("Valid phoneNo");
		}
		else
		{
			System.out.println("Phone Number should start 6-9 & must 10 digits");
			v2.login();
		}
	}
	public static void validationForPassword(String password)
	{
		FacebookVersion1 v1=new FacebookVersion1();
		String regex="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%^&*]).{6}$";
		if(password.matches(regex))
		{
			System.out.println("Login Successfully...");
		}
		else
		{
			System.out.println("*Password should contain atleast one UpperCase,LowerCase,Number and Special Character*");
			System.out.println("*Password must be 6 characters*");
			v1.password();
		}
	}
}
