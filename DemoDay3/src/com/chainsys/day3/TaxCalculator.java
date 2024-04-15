package com.chainsys.day3;
import java.util.Scanner;
public class TaxCalculator 
{
	double taxableIncome;
	public double taxCalculator(double grossSal,double totalSavings)
	{
		if(grossSal<=100000)
		{
		   System.out.println("Your Tax  ");
		   taxableIncome=0;
		}
		else if(grossSal>100000 && grossSal<=200000)
		{
			 if(totalSavings>100000)
			 {
				 System.out.println("Your Tax  ");
				 taxableIncome=(10*totalSavings)/100;
			 }
			 else
			 {
				 System.out.println("Your Tax  ");
				 taxableIncome=0;
			 }
		}
		else if(grossSal>200000 && grossSal<=500000)
		{
			 if(totalSavings>200000)
			 {
				 System.out.println("Your Tax  ");
				 taxableIncome=(20*totalSavings)/100;
			 }
			 else
			 {
				 System.out.println("Your Tax  ");
				 taxableIncome=0;
			 }
		}
		else 
		{
			 if(totalSavings>500000)
			 {
				 System.out.println("Your Tax  ");
				 taxableIncome=(30*totalSavings)/100;
			 }
			 else
			 {
				 System.out.println("Your Tax  ");
				 taxableIncome=0;
			 }
		}
		return taxableIncome;	
	}
	public static void main(String[] args) 
	{
		double grossSal;
		double totalSavings;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the gross salary");
		grossSal=scn.nextDouble();
		if(grossSal>0)//validation
		{
			totalSavings =grossSal-100000;
			System.out.println("Deducted Salary = "+totalSavings);
			if(totalSavings>0)
			{
				TaxCalculator tc=new TaxCalculator();
				double tax=tc.taxCalculator(grossSal,totalSavings);
				System.out.println(tax);
			}
			else
			{
				System.out.println("Invalid data...");
			}
		}
		else
		{
			System.out.println("Invalid Data...");
		}
	}
}
