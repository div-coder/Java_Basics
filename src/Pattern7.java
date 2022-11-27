import java.util.*;
public class Pattern7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++)
        {
            for(int col = 1; col<=n; col++)
            {
                if(col>=row)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
