package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T68
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        String s = cin.next();
        int n = cin.nextInt();

        if(s.equals("Home") && n == 1)
        {
            System.out.println("Yes");
        }
        else if(s.equals("Home") && n%2==1)
                {
                    System.out.println("No");
                }
        else if(s.equals("Home") && n%2==0)System.out.println("Yes");


        if(s.equals("School") && n == 1)
        {
            System.out.println("Yes");
        }else if(s.equals("School") && n%2==1) System.out.println("Yes");
        else if(s.equals("School") && n%2==0)System.out.println("No");
    }
}
