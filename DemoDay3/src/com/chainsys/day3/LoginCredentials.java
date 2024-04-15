package com.chainsys.day3;
import java.util.Scanner;
public class LoginCredentials 
{
	public static void login()
	{
		System.out.println("Login Page");
		System.out.println("==========");
		LoginCredentials.validation();
	}
	public static void main(String[] args) 
	{
		LoginCredentials.login();
	}
	public static void password(String password)
	{
		String regex="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%^&*]).{8}$";
		if(password.matches(regex))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("*Password should contain atleast one UpperCase,LowerCase,Number and Special Character*");
			System.out.println("*Password must be 8 characters*");
			LoginCredentials.login();		
		}
	}
	public static void validation()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Username");
		String username=scn.next();
		String regex="^[a-zA-Z]*";
		if(username.matches(regex))
		{
			System.out.println("Enter password");
			String password=scn.next();
			LoginCredentials.password(password);
		}
		else
		{
			System.out.println("*Username should be alphabets only*");
			System.out.println("(e.g)xyz123@");
			LoginCredentials.validation();
		}
	}
}