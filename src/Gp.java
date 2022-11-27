// Program to print series of Geometric progression
import java.util.*;
public class Gp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int a = sc.nextInt();
        System.out.print("Common Ratio: ");
        int cr = sc.nextInt();
        System.out.print("Upto Last term: ");
        int n = sc.nextInt();
        int term = a;
        for(int i=0;i<=n; i++)
        {
            System.out.print(term+",");
            term = term*cr;
        }
    }
}
