
       //*****
       //*****
       //*****
       //*****
import java.util.*;
public class Pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
