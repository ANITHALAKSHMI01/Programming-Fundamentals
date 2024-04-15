package com.chainsys.day3;
import java.util.Scanner;
public class FascinatingNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Find Fascination number or not");
		System.out.println("==============================");
		FascinatingNumber.hasThreeDigits();
	}
	public static void hasThreeDigits()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		boolean result=FascinatingNumber.validation(number);
		if(result==true)
		{
			System.out.println(number+" is Fascinate number");
		}
		else
		{
			System.out.println(number+" is not a Fascinate number");
		}
	}
	public static boolean validation(int num)
	{
		boolean flag=true;
		int result1=num*2;
		int result2=num*3;
		if(num>=100)
		{
			String convertNumber=Integer.toString(num);
			String convertResult1=Integer.toString(result1);
			String convertResult2=Integer.toString(result2);
			String concat=convertNumber+convertResult1+convertResult2;
			System.out.println("Number after Concatenation = "+concat);
			for(char c='1';c<='9';c++)
			{
				int count=0;
				for(int i=0;i<concat.length();i++)
				{
					char ch=concat.charAt(i);
					if(ch==c)
					{
						count++;
					}
				}
				if(count>1 || count==0)
				{
					flag=false;
					break;
				}
			}
		}
		else
		{
			flag=false;
		}
		return flag;
	}		
}
