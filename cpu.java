import java.util.Scanner;
import java.lang.String;

public class CPU {

double price;
public class Processor{
float nocores;
String manufacturer;
void processorinfo(float a,String processorname) {
nocores=a;
manufacturer=processorname;
System.out.println("\nInformation of Processor");
System.out.println("No. of cores:"+nocores+"\nManufacturer:" +manufacturer);
}
}
static class RAM{
float memory;
String manufacturer;
void raminfo(float b,String ram) {
memory=b;
manufacturer=ram;
System.out.println("\nInformation of RAM" );
System.out.println("Memory:"+memory+"\nManufacturer:"+manufacturer);
}
}

public static void main(String[] args) {
CPU obj=new CPU();
CPU.Processor obj1=obj.new Processor();
CPU.RAM obj2=new CPU.RAM();

Scanner sc=new Scanner(System.in);
System.out.println("Enter price of CPU");
obj.price=sc.nextInt();

System.out.println("Enter Processor details:");
float a=sc.nextFloat();
Scanner sc1=new Scanner(System.in);
String processorname=sc1.nextLine();

System.out.print("Enter RAM details:");
float b=sc.nextFloat();
String ram=sc1.nextLine();

sc.close();
sc1.close();

System.out.println("\nThe price of CPU is"+obj.price);

obj1.processorinfo(a, processorname);
obj2.raminfo(b, ram);
}

}