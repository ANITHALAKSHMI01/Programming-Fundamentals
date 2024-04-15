package com.chainsys.day3;
import java.util.Scanner;
public class IntegerAverageProduct 
{
	public static void main(String[] args) 
	{
		IntegerAverageProduct.validation();
	}
	public static void validation()
	{
		int count=0;
		int sum=0;
		int product=1;
		boolean flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer or 'q' to quit");
		while(true)
		{
			String number=sc.nextLine();
			if(number.equalsIgnoreCase("q"))
			{
				break;
			}
			flag=true;
			for(int i=0;i<number.length();i++)
			{
				char ch=number.charAt(i);
				if(!Character.isDigit(ch) && ch!='-')
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				int num=Integer.parseInt(number);
				count++;
				sum=sum+num;
				product=product*num;
			}
			else
			{
				System.out.println("Please enter Integer or 'q' to quit");
				IntegerAverageProduct.validation();
			}
		}
		if(count>0)
		{
			double average=sum/count;
			System.out.println("Average of given numbers : "+average);
			System.out.println("Product of given numbers : "+product);
		}
		else
		{
			System.out.println("You didn't enter number");
			System.out.println("Please enter Integer or 'q' to quit");
			IntegerAverageProduct.validation();
		}
	}
}
