import java.util.*;
public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        int c=1;
        for(int row = 1; row<=n; row++)
        {
            for(int col = 1; col<=row; col++)
            {
                c = c + 1;
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
}
