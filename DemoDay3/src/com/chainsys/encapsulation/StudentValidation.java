package com.chainsys.encapsulation;
import java.util.Scanner;
public class StudentValidation 
{
	public static void validation(int id)
	{
		Scanner sc=new Scanner(System.in);
		if(id>0)
		{
			System.out.println("Enter Name");
			String name=sc.next();
			String regex="^[a-zA-Z]*$";
			if(name.matches(regex))
			{
				sc.nextLine();
				System.out.println("Enter address");
				String address=sc.nextLine();
				String regex1="^[.0-9a-zA-Z\s,-,/]+$";
				if(address.matches(regex1))
				{
					Student s1=new Student(id,name,address);
					System.out.println("Student Detail");
					System.out.println("==============");
					System.out.println("Id\tName\tAddress");
					System.out.println("-----------------");
					System.out.println(s1.getId()+"\t"+s1.getName()+"\t"+s1.getAddress());
				}
				else
				{
					System.out.println("Please enter valid address");
					Student.details();
				}
			}
			else
			{
				System.out.println("Name should be alphabet & 1st character uppercase");
				Student.details();
			}
		}
		else
		{
			System.out.println("Id should be Integers...");
			Student.details();
		}
	}
}
