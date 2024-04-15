package com.chainsys.day3;
import java.util.Scanner;
public class CompanyBonus 
{
	public static double salary;
	public static int yearOfService;
	public static double netBonusAmount;
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the salary");
		salary =scn.nextDouble();
		if(salary<=0) 
		{
			System.out.println("Invalid Data...");
		}
		else
		{
			System.out.println("Enter the year of service");
			yearOfService =scn.nextInt();
			CompanyBonus.validation(salary, yearOfService);
		}
	}
	public static void validation(double salary,int yearOfService)
	{
		if(yearOfService>=0)
		{
			if(yearOfService>5)
			{
				System.out.println("you are eligible for bonus...");
				netBonusAmount=salary*5/100;
				System.out.println("your Net Bonus Amount = "+netBonusAmount);
			}
			else
			{
				System.out.println("You are not eliglible for bonus");
				System.out.println("Come After "+(6-yearOfService)+" years");
			}
		}
		else
		{
			System.out.println("Invalid Data...");
		}
	}
	
}
