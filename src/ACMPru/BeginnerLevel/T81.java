package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T81
{
    public static void main(String[] args)
    {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int []a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = cin.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }

            if(a[i]>max)
            {
                max=a[i];
            }
        }

        System.out.print(min + " " + max);
    }
}
