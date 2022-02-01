package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T233
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int []a=new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = cin.nextInt();
        }


        int t=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]<=437)
            {
                t++;
                System.out.println("Crash " + (i+1));
                break;
            }
        }
        if(t==0) System.out.println("No crash");
    }
}
