package Job.NewEra;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 7;
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = in.nextInt();
            }
        }

        int[] diagonal1 = new int[n];
        int[] diagonal2 = new int[n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    diagonal1[i] = a[i][j];
                }
            }
        }

        int j =0;
        for(int i=n-1; i>=0; i--)
        {
            diagonal2[j] = a[i][j];
            j++;
        }

        for(int i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i==j)
                {
                    a[i][j] = diagonal2[i];
                }
            }
        }

        j =0;
        for(int i=n-1; i>=0; i--)
        {
            a[i][j] = diagonal1[j];
            j++;
        }


        for(int i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
