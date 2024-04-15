package com.chainsys.day3;
import java.util.Scanner;
public class StudentAllowForExam 
{
	public static void main(String[] args) 
	{
		int noch;//noch-->no of classes held
		int noca;//noca-->no of classes attended
		int poca;//poca-->percentage of classes attended
		char mc;//mc-->medical cause
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of classes held");
		noch=sc.nextInt();
		if(noch>0)
		{
			System.out.println("Enter the no of classes attended");
			noca=sc.nextInt();
			if(noca>0)
			{
				poca=(noca*100)/noch;
				System.out.println("Percentage of class attended = "+poca);
				if(poca>75)
				{
					System.out.println("You will be allowed to sit in exam");
				}
				else
				{
					System.out.println("Enter Medical Cause Or Not('Y' or 'N')");
					mc=sc.next().charAt(0);
					if(mc=='Y' || mc=='N')
					{
						if(mc=='Y')
						{
							System.out.println("You will be allowed to sit in exam");
						}
						else
						{
							System.out.println("You will not be allowed to sit in exam");
						}
					}
					else
					{
						System.out.println("Invalid data...");
					}
				}
			}
			else
			{
				System.out.println("Invalid data...");
			}		
		}
		else
		{
			System.out.println("Invalid data...");
		}
		
	}
}
