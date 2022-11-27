import java.util.*;
public class positive_negative
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    if(n >= 0)
    {
      System.out.println("Number is positive");
    }
    else
    {
      System.out.println("Number is negative");
    }
  }
}