package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T264
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = cin.nextInt();
        }

        int g=0;
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(a[i]>0)
            {
                count++;
            }else count = 0;
            if(count>g) g = count;
        }

        System.out.println(g);
    }
}