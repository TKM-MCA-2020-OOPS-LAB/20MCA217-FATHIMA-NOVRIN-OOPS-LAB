import java .util.*;
import java.time.*;

interface bil_cal

{
    public void calc();
}

class calculate implements bil_cal
{
    int ord,date,p_id,qty,u_p,tot;
    String pname;

    public void details()
    {
       Scanner s=new Scanner(System.in);
       System.out.println("enter the product ID");
       p_id=s.nextInt();
       System.out.println("enter the product name");
       pname=s.next();
       System.out.println("enter the quantity");
       qty=s.nextInt();
       System.out.println("enter the unit price");
       u_p=s.nextInt();


    }

    public void order()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the order num");
        ord=inp.nextInt();


    }

    public void calc()
    {
        tot=qty*u_p;
        System.out.println("   "+p_id+"\t\t "+pname+"\t   "+qty+"\t\t    "+u_p+"\t         "+tot);
    }


    void display()
    {
        System.out.println("----------------BILL------------");
		System.out.print("\n");
		System.out.println("Order No : " + ord);
		LocalDate obj = LocalDate.now();
		System.out.print("\n");
		System.out.println("Date : " + obj);
		System.out.print("\n");
		System.out.println("Product Id\tName\tQuantity\tunit price\tTotal");
		System.out.print("_______________________________________________________________________");
		System.out.print("\n");
		
    }


}

public class bill
{
     public static void main(String[] args)
      {
          int no,net=0;
          Scanner inp2=new Scanner(System.in);
          System.out.println("enter number of products");
          no=inp2.nextInt();
          calculate c= new calculate();

          calculate obj[] = new calculate[no];

          c.order();
          for(int i=0;i<no;i++)
          {
              System.out.print("\n");
              System.out.println("Enter Details of product "+ (i+1));
            System.out.println("==========================");
    
              obj[i] = new calculate();
              obj[i].details();
              
          }
          c.display();
          for(int i=0;i<no;i++)
          {
              obj[i].calc();
              net = net + obj[i].tot;
          }
          
          System.out.println("_______________________________________________________________________");
          System.out.println("    "+"\t\t  "+"\t    "+"\t\tNet amount :"+"\t "+net);
              
          
    
      }
}