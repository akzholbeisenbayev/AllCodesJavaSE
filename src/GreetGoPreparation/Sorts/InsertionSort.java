package GreetGoPreparation.Sorts;

import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int []a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = cin.nextInt();
        }

        for(int i=1; i<n; i++)
        {
            int key = a[i];
            int j = i-1;

            while(j>=0 && a[j]>key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }


        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
