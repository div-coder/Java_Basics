// WAP to find no is Armstrong or not using while, do-while, for
import java.util.*;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rem, store = n, sum = 0;
        while(n>0)
        {
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(store == sum)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
    }
}
