package myproject;
import java.util.*;
public class priority_queue {
	public static void main(String[] args)
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int a=sr.nextInt();
		System.out.println("Enter the  elements");
		for(int i=0;i<a;i++)
		{
			String s=sr.next();
			queue.add(s);
		}
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("Iterating the queue elements\n ");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("After removing two elements \n");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next()); 
	}

}
}
