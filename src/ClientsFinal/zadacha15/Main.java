package ClientsFinal.zadacha15;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);


        int[] a = new int[30];
        int n = 30;
        for (int i = 0; i < n; i++)
        {
            a[i] = cin.nextInt();
        }

        int[] b = new int[30];

        for (int i = 0; i < n; i++)
        {
            if(a[i]>0) b[i] = a[i];
                    else if(a[i]<=0) b[i]=0;
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
