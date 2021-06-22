package myproject;

import java.util.Scanner;

class stack{
	int a[]=new int[20];
	int choice,top=-1,item;
	
	public void stack_operation()
	{
		System.out.println("enter the size of the stack");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do {
			
			System.out.println("1.push\n2.pop\n3.display\n4.exit");
			System.out.println("enter the choice:");
			choice=s.nextInt();
			switch(choice)
			{
			case 1 :if(top>=n-1) {
				System.out.println("Stack Overflow");
				}
			else {
				System.out.println("\nEnter the item to be pushed : ");
				item=s.nextInt();
	            top=top+1;
	            a[top]=item;
	            break;
			}
			
			case 2:if(top==-1) {
				System.out.println("Stack Underflow");}
				else{
					
					item = a[top];
			        System.out.println("Poped item is:" + item);
			        top = top-1;
			        break;
					}
			case 3: if( top < 0)
	        {
				 System.out.println("\nStack is empty\n");
	            
	              }
			
			else {
			 System.out.println("\nStack elements :\n\n");
	           for(int i=top;i>=0;i--)
	           {
	        	   System.out.println(a[i] );
	           System.out.println("\n");
	           }
	           break;
			}
			
			case 4:
		        break;
		        
		default:  System.out.println("Invalid Choice");   
			}
			
		}while(choice!=4);
	}
}

public class Genericstack {
	public static void main (String args[]) {
		stack ob=new stack();
		ob.stack_operation();
		
	}

}
