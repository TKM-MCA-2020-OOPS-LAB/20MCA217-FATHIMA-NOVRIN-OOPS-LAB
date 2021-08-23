package myproject;
import java.util.*;
public class compare_hashset {
	public static void main(String[] args) {
		Set<String> s1= new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements in s1: ");
		int n=sc.nextInt();
		System.out.println("\nEnter Elements of s1: ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			s1.add(st);
	 
		}
		
		System.out.println("\nEnter Number Of elements in s2: ");
		int n1=sc.nextInt();
		System.out.println("\nEnter Elements of s2: ");
		for(int i =0;i<n1;i++)
		{
			String str=sc.next();
			s2.add(str);
	 
		}
		System.out.println("\nHash Set 1: " + s1);
		System.out.println("\nHash Set 2: " + s2);
		
		//union
		 Set<String> union = new HashSet<String>(s1);
	        union.addAll(s2);
	        System.out.print("\nUnion of the two Set");
	        System.out.println(union);
	        
	     //intersection
	        Set<String> intersection = new HashSet<String>(s1);
	        intersection.retainAll(s2);
	        System.out.print("\nIntersection of the two Set");
	        System.out.println(intersection);
	      
	        //difference
	        Set<String> difference = new HashSet<String>(s1);
	        difference.removeAll(s2);
	        System.out.print("\nDifference of the two Set");
	        System.out.println(difference);	
	}
	
}
