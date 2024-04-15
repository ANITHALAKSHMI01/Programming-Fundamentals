package com.chainsys.day3;
public class Equation
{
	public static void main(String[] args) 
	{
		for(int y=5;y<10;y++)
		{
			System.out.println("y = "+y);
			System.out.println("-------");
			int result=2*(y*y) + y + 5;
			System.out.println("2y2 + y + 5 = "+result);
			System.out.println();
		}
	}
}
