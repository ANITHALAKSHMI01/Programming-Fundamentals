package com.chainsys.overriding;
import java.util.Scanner;
public class FacebookVersion1
{
	public void login()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the EmailId");
		String email=scn.next();
		FacebookValidation.validationForEmail(email);
	}
	public void password()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the password");
		String password=scn.next();
		FacebookValidation.validationForPassword(password);
	}
}
