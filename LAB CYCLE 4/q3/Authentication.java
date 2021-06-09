import java.util.Scanner;
public class Authentication {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String username,password;
        System.out.println(" enter the username");
        username=s.nextLine();
        System.out.println(" enter the pasword");
        password=s.nextLine();

        int name=username.length();
        int length=password.length();

        try{
            if(name>5 && length>5)
            {
                System.out.println("successfully login");
            }
            else
            {
                throw new invalidexception("information are invalid");

            }

        }
        catch(invalidexception e){
        System.out.println(e.getMessage());
        }

    }
    
}
