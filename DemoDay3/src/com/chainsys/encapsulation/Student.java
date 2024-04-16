package com.chainsys.encapsulation;
import java.util.Scanner;
public class Student 
{
	int id;
	String name;
	String address;
	public Student(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public static void details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=sc.nextInt();
		StudentValidation.validation(id);
	}
}
