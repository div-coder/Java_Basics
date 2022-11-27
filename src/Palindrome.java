// WAP to check palindrome using while, do-while, for
import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0, rem;
        int m = n;
/*
        while(n>0)
        {
            rem = n%10;
            rev =(rev*10) + rem;
            n = n/10;
        }
        if(rev == m)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
        // Program using do-while
        do
            {
                rem = n%10;
                rev =(rev*10) + rem;
                n = n/10;
            }while(n>0);
        if(rev == m)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
 */
        // Using for loop
        for(;n>0;)
        {
            rem = n%10;
            rev =(rev*10) + rem;
            n = n/10;
        }
        if(m == rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}

