package myproject;

import java.util.Scanner;

class NegativeIntegerException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeIntegerException(String s) {
             super(s);
		
	}
}

public class average {
	public static void main (String args[])
	{
		int number[];
		int sum=0;
		int i;
		float avg;
		float count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number");
		int n=sc.nextInt();
		number = new int[n];
		System.out.println("Enter the numbers:");
		for(i=0;i<n;i++)
	    {
	        number[i] = sc.nextInt();
	    }
		
	   try {
		    
		    for(i=0;i<n;i++) 
		    {
			    	if(number[i]<0)
			    	{
			    		throw new NegativeIntegerException("Numbers must be positive");
			    	}
			    	else {
			    	 sum = sum + number[i];
				      count++;
		    }
		    
	    }
		    avg=sum/count;
		    System.out.println("Average :"+avg);
		    }
	   
	   
	     catch(NegativeIntegerException e) {
   		System.out.println("Exception Occurred..... "+e);
   	}
   	    
   	
		   
	   }
	}