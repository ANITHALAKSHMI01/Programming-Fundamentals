package com.chainsys.overriding;
import java.util.Scanner;
public class FacebookVersion2 extends FacebookVersion1
{
	public void login()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Phone number");
		long phoneNo=scn.nextLong();
		String stringPhoneNo=Long.toString(phoneNo);
		FacebookValidation.validationForPhoneNo(stringPhoneNo);
	}
}
