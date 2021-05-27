import java.util.Scanner;

class student{
    int roll;
    String name;
    int phy,chem,maths;

    student()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the roll num");
        roll =s.nextInt();
        System.out.println("enter name");
        name=s.next();
        System.out.println("enter phyics marks");
        phy =s.nextInt();
        System.out.println("enter chemisty marks");
        chem =s.nextInt();
        System.out.println("enter maths marks");
        maths =s.nextInt();



    }
    
}

class sports extends student
{
    int score;
    sports()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter sports score");
        score=sc.nextInt();

    }
}
class result extends sports
{
void diplay()
{
   
		System.out.println("----------------- Academic  Details-------------");
		
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + roll);
		System.out.println("");
		System.out.println("-------------------MARKS------------");
		
		System.out.println("Physics :" + phy);
		System.out.println("Chemistry :" + chem);
		System.out.println("Maths :" + maths);
		System.out.println("");
		System.out.println("--------------------SPORTS SCORE------------");
		
		System.out.println("Score : " + score);
		System.out.println("");
}
}

public class finalresult{
     public static void main(String[] args) {
        result r =new result();
        r.diplay();
    }
}