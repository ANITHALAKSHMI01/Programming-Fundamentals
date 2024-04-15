package com.chainsys.day3;
import java.util.Scanner;
public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no for multiplication");
		int mul=sc.nextInt();
		if(mul>0)
		{
			System.out.println("Enter the count of multipliers");
			int multiplier=sc.nextInt();
			if(multiplier>0)//validation
			{
				System.out.println("Multiplication Table Of "+mul);
				System.out.println("============================");
				for(int i=multiplier;i>0;i--)
				{
					int result=multiplier*mul;
					System.out.println(multiplier+"*"+mul+" = "+result);
					multiplier--;
				}
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
}
