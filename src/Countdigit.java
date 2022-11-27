// WAP to count digits of number using while , do-while and for
import java.util.*;
public class Countdigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
/*        do
        {
            n = n/10;
            count = count + 1;

        }
        while(n>0);
        System.out.println("Number of digits: " + count); // Printing outside loop because we have to print the result of last iteration
*/
        // Using while
/*        while(n>0)
        {
            n = n/10;
            count = count + 1;
        }
        System.out.println("Answer: " + count);
 */
        for(;n>0;)
        {
            n = n/10;
            count++;

        }
        System.out.println("Answer: "+count);
    }
}
