package myproject;

import java.util.Scanner;

class Employees
{
	int empid,salary;
	String name,address;
	public Employees()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println(" Enter emp id : ");
		empid = inp.nextInt();
		System.out.println("Enter name : ");
		name = inp.next();
		System.out.println("Enter salary : ");
		salary = inp.nextInt();
		System.out.println("Enter address : ");
		address = inp.next();
			
	}
}

class Teachers extends Employees
{
	String dept,sub;
	public Teachers()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Department : ");
		dept = inp.next();
		System.out.println("Enter Subject : ");
		sub = inp.next();
	}
	
	public void display()
	{
		System.out.println("emp id : " + empid);
		System.out.println("name : " + name);
		System.out.println("address: " + address);
		System.out.println("salary : " + salary);
		System.out.println("department : " + dept);
		System.out.println("subject : " + sub);
		
	}
}

public class singleinheritance
{
	public static void main(String [] args)
	{
		int no;
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter no of teachers : ");
		
		no = inp2.nextInt();
		Teachers obj[] = new Teachers[no];
		
		for(int i=0;i<no;i++)
		{
			obj[i] = new Teachers();
			
		}
		
		 
	    for(int i=0;i<no;i++)
	    {
	    	System.out.println("\nDetails of Employee  No : " + (i+1));
	    	obj[i].display();
	    }
		
	}
}