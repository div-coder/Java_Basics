// WAP to reverse the number
import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int rev=0, rem;
   /*     while(n>0)
        {
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        System.out.println("Reverse= " + rev);
    */
    /*    do
        {
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }while(n>0);
        System.out.println("Reverse = "+rev);
     */
        for(;n>0;)
        {
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        System.out.println("Reverse = " +rev);
    }
}
