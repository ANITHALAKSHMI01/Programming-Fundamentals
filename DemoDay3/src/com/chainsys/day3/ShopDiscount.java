package com.chainsys.day3;
import java.util.Scanner;
public class ShopDiscount
{
	public static int quantity;
	public static double oneUnitCost=100.0;
	public static double totalCost;
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Welcome to Our Shop");
		System.out.println("-------------------");
		System.out.println("Please Enter the Quantity");
		quantity = scn.nextInt();
		ShopDiscount.validation(quantity);
	}
	public static void validation(int quantity)
	{
		if(quantity>0)
		{
			double costForPurchasedQuantity=quantity*oneUnitCost;
			if(costForPurchasedQuantity>1000)
			{
				//10% discount
				totalCost=(costForPurchasedQuantity*90)/100;
				System.out.println("10% discount For you...");
				System.out.println("Total Cost : "+totalCost);
			}
			else
			{
				System.out.println("Total Cost : "+costForPurchasedQuantity);
				System.out.println("To get a 10% discount,Purchase above 1000...");
			}
			System.out.println("Thank you!! Come Again...");
		}
		else
		{
			System.out.println("Invalid Data...");
		}
	}
}
