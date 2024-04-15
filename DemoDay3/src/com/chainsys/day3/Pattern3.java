package com.chainsys.day3;
public class Pattern3 
{
	public static void main(String[] args) 
	{
			for(int i=4;i>0;i--)
			{
				for(int j=1;j<=5-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(i*2)-1;k++)
				{
					if(k%2!=0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				System.out.println();
			}
	}
}
