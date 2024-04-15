package com.chainsys.day3;
public class Pattern2
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=5-i;j+=2)
				{
					System.out.print(" ");
				}
			    for(int k=0;k<i;k++)
				{
					System.out.print("*");
				}
			}
		    System.out.println();
		}
		for(int i=1;i<=5;i++)
			
		{
			if(i%2==0)
			{
				for(int j=1;j<=i;j+=2)
				{
					System.out.print(" ");
				}
			    for(int k=1;k<=5-i;k++)
				{
					System.out.print("*");
				}
			}
		    System.out.println();
		}
	}
}
