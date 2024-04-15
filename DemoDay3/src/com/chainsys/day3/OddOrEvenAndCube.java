package com.chainsys.day3;
import java.util.Scanner;
public class OddOrEvenAndCube 
{
	public static int cube;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		if(n>0)
		{
			for(int i=n;i>0;i--)
			{
				if(i%2==0)
				{
					System.out.println(i+" is Even No");
					int even=OddOrEvenAndCube.cube(i);
					System.out.println(even);
					System.out.println();
				}
				else
				{
					System.out.println(i+" is Odd No");
					int odd=OddOrEvenAndCube.cube(i);
					System.out.println(odd);
					System.out.println();
				}
			}
		}
		else
		{
			System.out.println("Invalid data...");
		}
	}
	public static int cube(int n)
	{
		System.out.println("Cube of "+n);
		System.out.println("----------");
		return cube=n*n*n;
	}
}
