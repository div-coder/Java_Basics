import java.util.*;
public class Pattern6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no: ");
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++)
        {
            for(int col = 1; col<=n-row+1;col++)
            {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}

