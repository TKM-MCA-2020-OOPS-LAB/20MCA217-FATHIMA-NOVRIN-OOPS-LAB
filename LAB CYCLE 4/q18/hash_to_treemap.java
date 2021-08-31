package myproject;
import java.util.*;

public class hash_to_treemap {
	public static void main(String[] args) {
		HashMap<Integer,String>hMap= new HashMap<Integer,String>();
  	  hMap.put( 10,"red");
        hMap.put( 22, "green" );
        hMap.put(3, "violet" );
        hMap.put( 44, "yellow");
        hMap.put(15, "black");
        System.out.println("HashMap Keys and Values: "+hMap);
        System.out.println("\n");
        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(hMap);
        System.out.println("TreeMap Keys and Values: " +tMap);
}

}
