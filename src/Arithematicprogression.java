// Program to display AP Series using  loop's
import java.util.Scanner;
public class Arithematicprogression
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int a = sc.nextInt();
        System.out.print("Common difference: ");
        int d = sc.nextInt();
        System.out.print("Upto Last term: ");
        int n = sc.nextInt();
        int term = a;
    /*    for(int i = 0; i<=n; i++)
        {
            System.out.print(term+",");
            term=term+d;
        }
     // Using while loop
        int i=0;
        while(i<=n)
        {
            i=i+1;
            System.out.print(term+",");
            term=term+d;
        }
     */
        int i=0;
        do
            {
                i=i+1;
                System.out.print(term+",");
                term=term+d;
            }while(i<=n);

    }
}
