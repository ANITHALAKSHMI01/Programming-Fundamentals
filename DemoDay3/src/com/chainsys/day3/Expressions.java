package com.chainsys.day3;
public class Expressions
{
	public static void main(String[] args) 
	{
		int x=2;
		int y=5;
		int z=0;
		System.out.println("x==2         -> "+(x==2));
		System.out.println("x!=5         -> "+(x!=5 ));
		System.out.println("x!=5 && y>=5 -> "+(x!=5 && y>=5));
		System.out.println("z!=0 || x==2 -> "+(z!=0 || x==2));
		System.out.println("!(y<10)      -> "+(!(y<10)));
	}
}
