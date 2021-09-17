package myproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class copy_evnod {

	public static void main(String args[]) throws IOException
	{ 
    FileInputStream fr = new FileInputStream("C:\\Users\\Jishad\\Documents\\java\\cycle6\\integer.txt");
    FileOutputStream fw1 = new FileOutputStream("C:\\Users\\Jishad\\Documents\\java\\cycle6\\even.txt");
    FileOutputStream fw2 = new FileOutputStream("C:\\Users\\Jishad\\Documents\\java\\cycle6\\odd.txt");
    System.out.println("\nFrom the file 'integers.txt' ,Odd Numbers are copied to 'odd.txt'file and Even numbers are copied to 'even.txt' file\n"); 
    int i;
    while((i=fr.read()) != -1) 
   	  
    {
     if(i%2==0)
     fw1.write(i);
     else
     fw2.write(i);
    }
    
    fr.close();
    fw1.close();
    fw2.close();
    
}
}
