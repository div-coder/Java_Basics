// Write a program to calculate the sum of first 10 natural number using do-while loop.
import java.util.*;
public class Sumdowhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Start number: ");
		int i = sc.nextInt();
		System.out.print("End number: ");
		int n = sc.nextInt();
		int sum = 0;
		do
		{
		  sum = sum + i;
		  i = i+1;
		}
		while(i<=n);
		System.out.println("Total sum = " + sum);
	}
}
