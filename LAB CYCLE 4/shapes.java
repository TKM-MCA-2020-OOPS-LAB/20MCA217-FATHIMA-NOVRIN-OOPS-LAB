package graphics;
import java.util.Scanner;
interface calculate
{
    void carea();
    void rarea();
    void tarea();
    void sarea();

}
public class shapes implements calculate
{
    Scanner sc=new Scanner(System.in);
    public void carea()
    {
        System.out.println("Enter radius:");
        int r=sc.nextInt();
        System.out.println("Area of circle:"+(Math.PI*r*r));
    }
    public void rarea()
    {
        System.out.println("Enter length:");
        int l=sc.nextInt();
        System.out.println("Enter breadth:");
        int b=sc.nextInt();
        System.out.println("Area of Rectangle:"+(l*b));
    }
    public void tarea()
    {
        System.out.println("Enter the base:");
		int b = sc.nextInt();
		
		System.out.println("Enter the height:");
		int h = sc.nextInt();
		
		System.out.println("Area of the triangle:"+(0.5*b*h));
    }
    public void sarea()
    {
        System.out.println("Enter the side:");
		int s = sc.nextInt();
		
		System.out.println("Area of the square:"+(s*s));
    }
}