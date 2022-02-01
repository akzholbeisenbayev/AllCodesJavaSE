package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T61
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int sum1 = 0, sum2 = 0;
        int a,b;

        for(int i=0; i<4; i++)
        {
            a = cin.nextInt();
            sum1+=a;
            b = cin.nextInt();
            sum2+=b;
        }

        if(sum1>sum2) System.out.println(1);
        if(sum2>sum1) System.out.println(2);
        if(sum1==sum2) System.out.println("DRAW");
    }

}
