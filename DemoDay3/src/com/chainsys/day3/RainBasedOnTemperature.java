package com.chainsys.day3;
import java.util.Scanner;
public class RainBasedOnTemperature
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Is it raining?");
		char ch=scn.next().charAt(0);
		if(ch=='Y' || ch=='N')
		{
			if(ch=='Y')
			{
				System.out.println("it is raining");
				System.out.println("To get an umbrella");
			}
			else
			{
				System.out.println("No rain...");
			}	
			System.out.println("Enter temperature");
			int temperature=scn.nextInt();
			if(temperature>0)
			{
				if(temperature<=32)
				{
					System.out.println("Bring a heavy jacket");
				}
				else if(temperature>32 && temperature<50)
				{
					System.out.println("bring a light jacket");
				}
				else
				{
					System.out.println("No jacket");
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
