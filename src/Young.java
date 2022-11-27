import java.util.*;
public class Young {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n >= 18  &&  n<=25)
        {
            System.out.println("Person is Young");
        }
        else
        {
            System.out.println("Person is not Young");
        }
    }
}