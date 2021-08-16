package myproject;
import java.util.*;
public class queue {
	public static void main(String args[])
	{
		Deque<String> dq= new ArrayDeque<String>();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scn.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			String st=scn.next();
			dq.add(st);
			 
		}
		System.out.println("\nInitial Queue After Adding Elements: " + dq);
		System.out.println("\nAfter Removing All Elements using Poll() method..");
		
		
		for(int i =0;i<n;i++)
		{
			
			dq.pop();
	 
		}
		System.out.println("\nFinal Queue Is: " + dq);
			
		}
		
				
		
	}

