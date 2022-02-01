package GreetGoPreparation.TwoTasks;

import java.util.Scanner;

public class FirstTask
{
    public static void main(String [] args)
    {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = cin.nextInt();
            }
        }


        int sum = 0, index = 0, temp = Integer.MIN_VALUE+1;
        for(int i=0; i<n; i++)
        {
            sum = 0;
            for(int j=0; j<n; j++)
            {
               sum+=a[i][j];
            }

            if(sum > temp)
            {
                temp = sum;
                index = i;
            }
        }

        System.out.println(index);
        temp = Integer.MAX_VALUE;


        for (int j = 0; j < n; j++)
        {
                if (a[index][j] < temp)
                {
                    temp = a[index][j];
                }
        }


        System.out.println(temp);
    }
}