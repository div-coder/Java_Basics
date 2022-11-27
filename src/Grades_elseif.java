import java.util.*;
public class Grades_elseif
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float m1,m2,m3;
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        int total  = (int)(m1+m2+m3);
        int avg = total/3;
        if(avg >= 70)
        {
            System.out.println("Grade :- A");
        }
        else if(avg>= 60 && avg<70)
        {
            System.out.println("Grade:- B");
        }
        else if(avg>=50 && avg< 60)
        {
            System.out.println("Grade:- C");
        }
        else if( avg>= 40 && avg< 50)
        {
            System.out.println("Grade:- D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
