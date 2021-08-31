package myproject;
import java.util.*;
public class Map_interface {
	public static void main (String args[])
	{
		Map<Integer,String> hm=new HashMap<>();

		 hm.put(1, "Novrin");
	        hm.put(2, "Anannya");
	        hm.put(3, "Rasika");
	        System.out.println("Initial Map: "+ hm);
	        
	        hm.put( (2), "Anila");
	        hm.put((4), "shad");
	        //Updating..
	        System.out.println("Updated Map " + hm);
	  
	        //Removing..
	        hm.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing 4th entry, Final Map  is : "+hm);
	}

}
