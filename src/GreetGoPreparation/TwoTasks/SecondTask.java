package GreetGoPreparation.TwoTasks;

import java.util.Scanner;

public class SecondTask
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int [] a = new int[n];


        for(int i=0; i<n; i++)
        {
            a[i] = cin.nextInt();
        }

        for (int i = 0, j = 0; j < n; j++)
        {
            if (a[j] != 0)
            {
                if (i < j)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                i++;
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+ " ");
        }
    }

}
