package com.chainsys.day3;
import java.util.Scanner;
public class CheckIf_Else_EndedWithSemicolon
{
	public static void main(String[] args)
	{
		double c;
		Scanner scn=new Scanner(System.in);
		System.out.println("Program Starts...");
		System.out.println("Enter the value : ");
		c=scn.nextDouble();
		if(c%2==0);
		{
			System.out.println("The Entered Value is Even");
		}
		/*If we use semicolon after if condition,
		 It can't allow else.
		 If we put else,It will throw compile time error
		 Even though the condition is not satisfied,block will execute*/
		System.out.println("Program Ends...");
	}
}
