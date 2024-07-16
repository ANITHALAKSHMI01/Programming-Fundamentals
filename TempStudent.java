package com.chainsys.stremdemo;
import java.util.List;
public class TempStudent 
{
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;
	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) 
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
}
class Student
{
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;
	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) 
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
	public String getName()
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
	public Address getAddress() 
	{
		return address;
	}
	public List<MobileNumber> getMobileNumbers() 
	{
		return mobileNumbers;
	}
	@Override
	public String toString()
	{
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + ", mobileNumbers="
				+ mobileNumbers + '}';
	}
}
class Address
{
	private String zipcode;
	public Address(String zipcode) 
	{
		this.zipcode = zipcode;
	}
	public String getZipcode()
	{
		return zipcode;
	}
	public void setZipcode(String zipcode) 
	{
		this.zipcode = zipcode;
	}
}
class MobileNumber
{
	private String number;
	public MobileNumber(String number) 
	{
		this.number = number;
	}
	public String getNumber()
	{
		return number;
	}
	public void setNumber(String number) 
	{
		this.number = number;
	}
}

