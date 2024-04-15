package com.chainsys.day3;
import java.util.Scanner;
public class SumOfDigits 
{
	public static int[] arr=new int[5];
	public static int sum;
	public static void main(String[] args) 
	{
		System.out.println("Sum of Digits Calculator");
		System.out.println("========================");
		SumOfDigits.sumOfDigits();
	}
	public static void sumOfDigits()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int copy=number;
		if(number>0)
		{
			int count=0;//no of digits
			SumOfDigits.validation(number,count,copy);
		}
		else
		{
			System.out.println("*Number should be positive*");
			System.out.println("Please give more than 1 and less than 5 digit no...");
			SumOfDigits.sumOfDigits();
		}
	}
	public static void validation(int n,int count,int num)
	{
		while(n>0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		if(count==1)
		{
			System.out.println("Please give more than 1 and less than 5 digit no...");
			SumOfDigits.sumOfDigits();
		}
		else if(count<=arr.length)
		{
			try
			{
				int result=SumOfDigits.execution(num);
				System.out.println("Sum Of "+num+" is "+result);
			}
			catch(ArrayIndexOutOfBoundsException a1)
			{
				a1.getMessage();
			}
		}
		else
		{
			System.out.println("Please give 5 & less digit Number...");
			SumOfDigits.sumOfDigits();
		}
	}
	public static int execution(int num)
	{
		int i=0;
		while(num>0)
		{
			arr[i]=num%10;
			sum=sum+arr[i];
			num=num/10;
			i++;
		}
		return sum;
	}
}
