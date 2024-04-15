package com.chainsys.day3;
import java.util.Scanner;
public class EmployeePlaceOfService 
{
	public static void main(String[] args) 
	{
		int age;
		char sex;
		char maritalStatus;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		if(age>0)
		{
			System.out.println("Enter Marital Status ('Y' or 'N')");
			maritalStatus=sc.next().charAt(0);
			if(maritalStatus=='Y' || maritalStatus=='N')
			{
				System.out.println("Enter sex ('M' or 'F')");
				sex=sc.next().charAt(0);
				EmployeePlaceOfService.validation(sex, age);
			}
			else
			{
				System.out.println("Invalid data...");
			}
		}
		else
		{
			System.out.println("Invalid data...");
		}
	}
	public static void validation(char sex,int age)
	{
		if(sex=='F' || sex=='M')
		{
			if(sex=='F')
			{
				System.out.println("She will work only in urban areas...");
			}
			else if((sex=='M') && (age>=20 && age<40))
			{
				System.out.println("He may work in anywhere...");
			}
			else if((sex=='M') && (age>=40 && age<60))
			{
				System.out.println("He will work in urban areas only...");
			}
			else
			{
				System.out.println("ERROR");
			}
		}
		else
		{
			System.out.println("Invalid data...");
		}
	}
}
