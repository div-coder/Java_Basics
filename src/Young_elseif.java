import java.util.*;
public class Young_elseif {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 14 && age <55)
        {
            System.out.println("Person is Young");
        }
        else if( age < 14 || age > 55)
        {
            System.out.println("Person is not Young");
        }
        else if(age >= 100)
        {
            System.out.println("Person is very old");
        }
        else
        {
            System.out.println("Data is incorrect");
        }
    }
}