import java.util.*;
public class Pattern4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        for(int row=1; row<=n; row++)
        {
            for(int col = 1; col<=row; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
