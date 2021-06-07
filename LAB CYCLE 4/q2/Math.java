package Arithemetic;

import java.util.Scanner;

interface operation {
	void addition();
	void subtraction();
	void multiplication();
	void division();
	}

public class Math implements operation  {
	public void addition() {
		Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the first number:");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the second number:");
		int b = sc1.nextInt();
		System.out.println("Sum is :"+(a+b));

}
public void subtraction() {
	Scanner sc2 = new Scanner(System.in);
		System.out.println("\nEnter the first number:");
		int a = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the second number:");
		int b = sc3.nextInt();
		
		System.out.println("Difference is :"+(a-b));
		
	}
public void multiplication() {
	Scanner sc4 = new Scanner(System.in);
	System.out.println("\nEnter the first number:");
	int a = sc4.nextInt();
	Scanner sc5 = new Scanner(System.in);
	System.out.println("Enter the second number:");
	int b = sc5.nextInt();
	System.out.println(" Product is :"+(a*b));
}
public void division() {
	Scanner sc6 = new Scanner(System.in);
	System.out.println("\nEnter the first number:");
	int a = sc6.nextInt();
	Scanner sc7 = new Scanner(System.in);
	System.out.println("Enter the second number:");
	int b = sc7.nextInt();
	System.out.println("Quotient  is :"+(a/b));
	
}
}

