package myproject;

import java.util.Scanner;

public class shapes {

	float area(float a)
	{
		float sqrarea=a*a;
		System.out.println("area of square"+sqrarea);
		return sqrarea;
	}
	float area(float a,float b)
	{
		float rctarea=a*b;
		System.out.println("area of square"+rctarea);
		return rctarea;
	}
	double area(double r)
	{
		double carea=3.14*r*r;
		System.out.println("area of square"+carea);
		return carea;
	}
	public static void main(String[] arg)
	{
		shapes obj=new shapes();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sides of shape");
		float a=s.nextInt();
		float b=s.nextInt();
		double r=s.nextInt();
		obj.area(a);
		obj.area(a,b);
		obj.area(r);
		
	}
	
}
