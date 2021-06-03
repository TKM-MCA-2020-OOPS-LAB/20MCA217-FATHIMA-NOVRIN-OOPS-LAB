package graphics;
import graphics.shapes;

public class areas{
public static void main(String args[])
{
    Shapes obj=new Shapes();
    System.out.println("Area of different Shapes"+"\n"+"-------------------------------");
    System.out.println("Circle"+"\n"+"-------------");
    obj.carea();
    System.out.println("Rectangle"+"\n"+"-------------");
    obj.rarea();
    System.out.println("Triangle"+"\n"+"--------------");
    obj.tarea();
    System.out.println("Square"+"\n"+"------------");
    obj.sarea();
}
}