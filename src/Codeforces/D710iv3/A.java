package Codeforces.D710iv3;

import java.util.Scanner;

public class A
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        long x, n,m;

        long temp;


        for(int k=0; k<t; k++)
        {
            n = cin.nextLong();
            m = cin.nextLong();
            x = cin.nextLong();

            temp = sol(n,m,x);
            System.out.println(temp);
        }
    }

    public static long sol(long n, long m, long x)
    {
        long column = (x-1) / n+1;
        long row = x - ((column-1)*n);

        long result = m * (row - 1) + column;

        return result;
    }
}
