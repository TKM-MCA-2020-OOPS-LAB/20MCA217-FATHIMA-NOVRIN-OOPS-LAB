
package myproject;
import java.io.File;
import java.io.*;
import java.util.*;

public class filelist{
  public static void main(String[] args) {

    File file = new File("C:\\Users\\Jishad\\Documents\\java\\cycle1 op");
    String[] list = file.list();

    for(String str : list) 
    {
      System.out.println(str);
    }
	System.out.println("\nSEARCHING FOR FILENAMES STARTING WITH 's':\n");
	
	FilenameFilter filter = new FilenameFilter() {
		public boolean accept(File dir, String fname) {
			return fname.startsWith("s");
		}
	};
	
	String[] search = file.list(filter);
	if(search == null) {
		System.out.println("File does not exist. .  ");		
	}
	else {
		for(int i=0; i<search.length;i++) {
			String fn = search[i];
			System.out.println(fn);
		}
	 }
  }
}