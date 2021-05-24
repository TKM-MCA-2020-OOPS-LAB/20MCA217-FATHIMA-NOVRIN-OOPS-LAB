import java.util.Scanner;
	public class Person{
		String name;
		String gender;
		String address;
		int age;
		
	public Person()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=s.next();
		System.out.println("Enter gender: ");
		gender=s.next();
		System.out.println("Enter address: ");
		address=s.next();
		System.out.println("Enter age: ");
		age=s.nextInt();
	}
	}

	class Employees extends Person {

		int Empid;
		String Company_name;
		String qualification;
		double salary;
		
	public Employees()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		Empid=s1.nextInt();
		System.out.println("Enter Company name: ");
		Company_name=s1.next();
		System.out.println("Enter qualification: ");
		qualification=s1.next();
		System.out.println("Enter salary: ");
		salary=s1.nextDouble();	
	}
	}
	class Teachers extends Employees
	{
		int teacherid;
		String department;
		String subject;
		
	public Teachers()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter teacher id: ");
		teacherid=s2.nextInt();
		System.out.println("Enter department details: ");
		department=s2.next();
		System.out.println("Enter subject taught: ");
		subject=s2.next();
	}
	void display()
	{
		System.out.println("--------------DETAILS-----------------");
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Employee id: "+Empid);
		System.out.println("Company name: "+Company_name);
		System.out.println("Qualification: "+qualification);
		System.out.println("Salary: "+salary);
		System.out.println("Teacher id: "+teacherid);
		System.out.println("Department details: "+department);
		System.out.println("Subject: "+subject);
		
	}
	public static void main(String args[])
	{
		int n,i;
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the No of employees: ");
		n=s3.nextInt();
		Teachers T1[]=new Teachers[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter details of employee no: "+(i+1));
			T1[i]=new Teachers();
			
		}
	    for(i=0;i<n;i++)
	    {
	    	T1[i].display();
	    }
	}
	}