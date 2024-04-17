package com.chainsys.encapsulation;
import java.util.Scanner;
public class TestABCBank
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		TestABCBank.getUserDetails();
		scn.close();
	}
	public static void getUserDetails()
	{
		BankValidation.validation();
	}

	public static void deposit(long accountNo)
	{
		System.out.println("Deposit done via AccNo");
	}
	public static void deposit(long phoneNo,long accountNo)
	{
		System.out.println("Deposit done via Phoneno");
	}
	public static void showAvailableSavingPlans(int deposit)
	{
		if(deposit>2000 && deposit<5000)
		{
			System.out.println("We will provide 2% Interest for you");
		}
		else if(deposit>5000)
		{
			System.out.println("We will provide 5% Interest for you");
		}
		else
		{
			System.out.println("If You need high interest,deposit above 2000");
		}
	}
}
