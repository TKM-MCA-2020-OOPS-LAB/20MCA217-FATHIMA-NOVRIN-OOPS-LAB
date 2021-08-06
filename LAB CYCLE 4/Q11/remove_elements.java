package myproject;
import java.util.*;

public class remove_elements {
	public static void main(String args[]) {
		LinkedList<String> list=new LinkedList<String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of items to be added");
		 int num=sc.nextInt();
		 System.out.print("Add items ");
	      for(int i=0;i<num;i++)
	       {
	        	
	            String s=sc.next();
	            list.add(s);
	        }
	        System.out.print(" ");
	        System.out.print(" ");
	        System.out.println("liked list after adding");
	       
	        Iterator<String> itr=list.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	        list.clear();
	        System.out.println("Linked list After removing: " + list);

	    }
		
		
		
	}


