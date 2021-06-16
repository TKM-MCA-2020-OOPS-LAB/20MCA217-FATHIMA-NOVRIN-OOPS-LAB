package myproject;

import java.util.Scanner;

class fibnocci implements Runnable{
	public void run()
	{
		System.out.println("fibnocci series");
		int n=10;
		int n1=1,n2=1,n3,i;
		System.out.print(n1+" "+n2); 
	    for(i=2;i<n;i++) 
	    {
	    	n3=n1+n2;
	    	System.out.print(" "+n3);  
	    	n1=n2;
	    	n2=n3;
	    }System.out.println("\n");     
	}
	
}
class even implements Runnable
{
	public void run()
	{
		System.out.println("Even numbers");
		Scanner a=new Scanner(System.in);
		System.out.println("enter the limit");
		int lim=a.nextInt();
		for(int i=0;i<lim;i++) 
		{
			if(i%2 ==0) {
				System.out.println(i+"");
			}
		}
	}
}

public class multithread {
	public static void main (String args[]) throws InterruptedException
	{
		fibnocci f=new fibnocci();
		Thread a=new Thread(f);
		even e=new even();
		Thread b=new Thread(e);
		a.start();
		a.sleep(100);
		b.start();
		b.sleep(100);
		
		
		}

}
