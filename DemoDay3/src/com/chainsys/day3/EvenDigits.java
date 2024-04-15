package com.chainsys.day3;
import java.util.Scanner;
public class EvenDigits 
{
	public static int[] arr=new int[5];
	public static void main(String[] args) 
	{
		System.out.println("Even Digits Finder");
		System.out.println("------------------");
		EvenDigits.evenDigits();
	}
	public static void execution(int num)
	{
		System.out.println("Even digits of a number");
		System.out.println("=======================");
		int i=0;
		while(num>0)
		{
			arr[i]=num%10;
			num=num/10;
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
			i++;
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
			System.out.println("*Number should be positive*");
			System.out.println("Please give more than 1 and less than 5 digit no...");
			EvenDigits.evenDigits();
		}
		else if(count<=arr.length)
		{
			try
			{
				EvenDigits.execution(num);
			}
			catch(ArrayIndexOutOfBoundsException a1)
			{
				a1.getMessage();
			}
		}
		else
		{
			System.out.println("Please give 5 & less digit Number...");
			EvenDigits.evenDigits();
		}
	}
	public static void evenDigits()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		if(n>0)
		{
			int count=0;//no of digits
			EvenDigits.validation(n,count,num);
		}
		else
		{
			System.out.println("Please give 5 & less digit Number...");
			EvenDigits.evenDigits();
		}
	}
}
