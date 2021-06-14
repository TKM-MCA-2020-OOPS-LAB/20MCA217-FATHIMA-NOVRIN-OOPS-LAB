package myproject;

import java.util.Scanner;

class multiplication extends Thread
{
	public void run()
	{
		System.out.println("multipilcation table of 5");
		int n=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
			
			
		}
	}
}
class prime extends Thread
{
	public void run()
	{
		System.out.println("prime numbers");
		System.out.println("enter the limit");
		Scanner s1= new Scanner(System.in);
		int l=s1.nextInt();
		int status = 1;
	      int num = 3;
	      if (l>= 1)
	      {
	         System.out.println("First "+l+" prime numbers are:");
	      
	         System.out.println(2);
	      }

	      for ( int i = 2 ; i <=l ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
		}s1.close();
	}
	}

public class main {

	public static void main(String[] args) throws InterruptedException {
		multiplication m= new multiplication();
		m.start();
		Thread.sleep(100);
		prime p=new prime();
		p.start();
		Thread.sleep(100);
		
	

	}

}
