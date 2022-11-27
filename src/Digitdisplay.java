import java.util.*;
public class Digitdisplay
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
        do {
            int rem = n%10;
            n = n/10;
            System.out.print(rem); // USING PRINT COMMAND INSIDE BECAUSE WE WANT TO PRINT ALL THE OUTPUT ONE BY ONE OR WE HAVE TO PRINT IMMEDIATELY(ON THE SPOT)
        }
        while (n>0);
    }
}
