package com.chainsys.encapsulation;
import java.util.Scanner;
public class ABCBank 
{
	String name;
	long accountNo;
	long phoneNo;
	double availableBalance;
	int deposit;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public long getAccountNo() 
	{
		return accountNo;
	}
	public void setAccountNo(long accountNo)
	{
		this.accountNo = accountNo;
	}
	public long getPhoneNo() 
	{
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public double getAvailableBalance() 
	{
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) 
	{
		this.availableBalance = availableBalance;
	}
	public int getDeposit() 
	{
		return deposit;
	}
	public void setDeposit(int deposit)
	{
		this.deposit = deposit;
	}
	@Override
	public String toString()
	{
		return "ABCBank [name=" + name + ", accountNo=" + accountNo + ", phoneNo=" + phoneNo + ", availableBalance="
				+ availableBalance + ", deposit=" + deposit + "]";
	}
	
	public static void getUserDetails()
	{
		Scanner scn=new Scanner(System.in);
		ABCBank bank=new ABCBank();
		System.out.println("Enter name");
		String name=scn.next();
		String regex="^[a-zA-Z]*$";
		if(name.matches(regex))
		{
			bank.setName(name);
			System.out.println("Enter Account Number");
			long accountNo=scn.nextLong();
			if(accountNo>0)
			{
				bank.setAccountNo(accountNo);
				System.out.println("Enter Phone number");
				{
					long phoneNo=scn.nextLong();
					String phone=Long.toString(phoneNo);
					String regex1="(91|0)?[6-9][0-9]{9}$";
					if(phone.matches(regex1))
					{
						long phoneNo1=Long.parseLong(phone);
						bank.setPhoneNo(phoneNo1);
						System.out.println("Enter deposit amount");
						int deposit=scn.nextInt();
						if(deposit>0)
						{
							bank.setDeposit(deposit);	
						}
						else
						{
							System.out.println("Deposit should be Positive value");
							ABCBank.getUserDetails();
						}
					}
					else
					{
						System.out.println("Phone Number should start 6-9 & must 10 digits");
						ABCBank.getUserDetails();
					}
				}
			}
			else
			{
				System.out.println("Acount Number should be Positive");
				ABCBank.getUserDetails();
			}	
		}
		else
		{
			System.out.println("Name should be alphabet");
			ABCBank.getUserDetails();
		}
		System.out.println("1.Deposit via Accno\n2.Deposit via Phoneno");
		System.out.println("Please make a choice");
		int choice=scn.nextInt();
		if(choice==1 || choice==2)
		{
			switch(choice)
			{
				case 1 :ABCBank.deposit(bank.getAccountNo());
				        break;
				        
				case 2 :ABCBank.deposit(bank.getPhoneNo(),bank.getAccountNo());
				        break;
				        
			   default:System.out.println("Please enter 1 or 2");
				     
			}
		}
		System.out.println("Account Details");
		System.out.println("===============");
		System.out.println("Name               : "+bank.getName());
		System.out.println("Account Number     : "+bank.getAccountNo());
		System.out.println("Phone Number       : "+bank.getPhoneNo());
		System.out.println("Deposit Amount     : "+bank.getDeposit());
		ABCBank.showAvailableSavingPlans(bank.getDeposit());
		bank.setAvailableBalance(100000.50+bank.getDeposit());
        System.out.println("AvailableBalance   : "+bank.getAvailableBalance());
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
