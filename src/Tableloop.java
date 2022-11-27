import java.util.*;
public class Tableloop
{
    public static void main (String[] args) 
{
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table :");
        for(int i = 1; i<=10; i++)
        {
            int p = n * i;
            System.out.println(n +"x"+i +"=" + p);
        }
    }
}
}