package com.chainsys.overriding1;
public class TestOfFacebook
{
	public static void main(String[] args) 
	{
		System.out.println("Facebook Login Page");
		System.out.println("-------------------");
		FacebookVersion1 v1=new FacebookVersion1();
		System.out.println("Login done via Email");
		System.out.println("====================");
		v1.login();
		v1.password();
		FacebookVersion2 v2=new FacebookVersion2();
		System.out.println("Login done via Phone Number");
		System.out.println("===========================");
		v2.login();
		v2.password();
	}
}
