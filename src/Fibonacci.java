import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the terms you want :");
        int n=sc.nextInt();
        int t1=0, t2=1;
        for(int i=0; i<=n; i++)
        {
            System.out.print(t1);
            System.out.print(t2);
            int t3 = t2 + t1;
            t2 = t3;
            t1 = t2;
        }
    }
}
