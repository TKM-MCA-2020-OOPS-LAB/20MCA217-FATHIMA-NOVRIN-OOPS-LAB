package myproject;
import java.util.*;


public class hash_set {
	public static void main (String args[])
	{
		LinkedHashSet<String> hashset = new LinkedHashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ofletters");
		int n=sc.nextInt();
		System.out.println("enter the letters");
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			hashset.add(s);
			
		}
		System.out.println("\nOriginal LinkedHashSet:" + hashset);  
		 System.out.println("\nRemoving 'A' from LinkedHashSet: " + hashset.remove("A"));
		 System.out.println("\nSize Of LinkedHashSet: " + hashset.size());
		 System.out.println("\nChecking if 'B' is present=" + hashset.contains("B"));
		 System.out.println("\nAfter Performing Operations, Final LinkedHashSet: " + hashset);
		 
		 System.out.println("\nAfter Iterating.. ");
	        for (String s : hashset)
	            System.out.print(s + ", ");
	        System.out.println();
		
		
		
		
	}

}
