package com.chainsys.encapsulation;
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
}
