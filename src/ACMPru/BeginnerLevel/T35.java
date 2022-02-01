package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T35
{
    public static void main(String[]args)
    {


        int n, m, k;

        Scanner cin = new Scanner(System.in);

        k = cin.nextInt();
        long []d = new long[k];

        for(int i=0; i<k; i++)
        {
            n = cin.nextInt();
            m = cin.nextInt();
            d[i] = 19*m + (n+239)*(n+366)/2;

        }

        for(int i=0; i<k; i++)
        {
            System.out.println(d[i]);
        }
    }
}
