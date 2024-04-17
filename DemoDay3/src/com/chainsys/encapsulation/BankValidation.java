package com.chainsys.encapsulation;
import java.util.Random;
import java.util.Scanner;
public class BankValidation 
{
	public static void validation()
	{
		Scanner scn=new Scanner(System.in);
		ABCBank bank=new ABCBank();
		System.out.println("Enter name");
		String name=scn.next();
		String regex="^[a-zA-Z]*$";
		if(name.matches(regex))
		{
			bank.setName(name);
//			System.out.println("Enter Account Number");
//			long accountNo=scn.nextLong();
//			String stringAccountNo=Long.toString(accountNo);
//			String regex2="^[0-9]{9,13}$";
//			if(stringAccountNo.matches(regex2))
//			{
//				long accountNo1=Long.parseLong(stringAccountNo);
//				bank.setAccountNo(accountNo1);
				System.out.println("Enter Phone number");
				{
					long phoneNo=scn.nextLong();
					String stringPhoneNo=Long.toString(phoneNo);
					String regex1="(91|0)?[6-9][0-9]{9}$";
					if(stringPhoneNo.matches(regex1))
					{
						long phoneNo1=Long.parseLong(stringPhoneNo);
						bank.setPhoneNo(phoneNo1);
						long accountNo=BankValidation.accountNo();
						bank.setAccountNo(accountNo);
						System.out.println("Enter deposit amount");
						int deposit=scn.nextInt();
						if(deposit>0)
						{
							bank.setDeposit(deposit);	
						}
						else
						{
							System.out.println("Deposit should be Positive value");
							TestABCBank.getUserDetails();
						}
					}
					else
					{
						System.out.println("Phone Number should start 6-9 & must 10 digits");
						TestABCBank.getUserDetails();
					}
				}
			}
////			else
////			{
////				System.out.println("Acount Number should be Positive & must contain 11-18 digits");
////				TestABCBank.getUserDetails();
////			}	
//		}
		else
		{
			System.out.println("Name should be alphabet");
			TestABCBank.getUserDetails();
		}
		System.out.println("1.Deposit via Accno\n2.Deposit via Phoneno");
		System.out.println("Please make a choice");
		int choice=scn.nextInt();
		if(choice==1 || choice==2)
		{
			switch(choice)
			{
				case 1 :TestABCBank.deposit(bank.getAccountNo());
				        break;
				        
				case 2 :TestABCBank.deposit(bank.getPhoneNo(),bank.getAccountNo());
				        break;
				        
			   default:System.out.println("Please enter 1 or 2");
				     
			}
			System.out.println("Account Details");
			System.out.println("===============");
			System.out.println("Name               : "+bank.getName());
			System.out.println("Account Number     : "+bank.getAccountNo());
			System.out.println("Phone Number       : "+bank.getPhoneNo());
			System.out.println("Deposit Amount     : "+bank.getDeposit());
			TestABCBank.showAvailableSavingPlans(bank.getDeposit());
			bank.setAvailableBalance(100000.50+bank.getDeposit());
	        System.out.println("AvailableBalance   : "+bank.getAvailableBalance());
		}	
		scn.close();
	}
	public static long accountNo()
	{
		long accountNo;
		Random randomAccountNo=new Random();
		accountNo=randomAccountNo.nextLong(1000000000000l);
		return accountNo;
	}
}
