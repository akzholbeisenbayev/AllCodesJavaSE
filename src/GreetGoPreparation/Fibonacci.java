package GreetGoPreparation;

import java.util.Scanner;

public class Fibonacci
{
    static int[] cashe = new int[100];

    public static int Fibo(int n)
    {
        for(int i=0; i<100; i++)
        {
            cashe[i] = 0;
        }

        if (n<=1) return n;
        if(cashe[n] == 0)
            cashe[n] = Fibo(n-1) + Fibo(n-2);
        return cashe[n];
    }

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("n = ");
        int n = cin.nextInt();

        int f1 = 0;
        int f2 = 1;
        int a = 0;
        System.out.print(f1 + " " + f2 + " ");
        for(int i=2; i<n; i++)
        {
            a = f1 + f2;
            System.out.print(a + " ");
            f1 = f2;
            f2 = a;
        }


//        int[]a = new int[n];
//
//        a[0] = 0;
//        a[1] = 1;
//
//        for(int i=2; i<n; i++)
//        {
//            a[i] = Fibo(i);
//        }
//
//        for(int i=0; i<n; i++)
//        {
//            System.out.print(a[i] + " ");
//        }
    }
}
