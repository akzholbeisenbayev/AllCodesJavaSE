package GreetGoPreparation.Money;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        Scanner cin = new Scanner(System.in);
//        int n = cin.nextInt();
//        func(n);
        System.out.println(Integer.MAX_VALUE);
    }

    public static void func(int n)
    {
        int[] a = {200,100,50,20,10,5,1};
        int temp = 1;
        temp = n;

        int i=0, sum = 0;
        while(temp>0)
        {
            sum =0;
            while(n/a[i]>=1)
            {
                sum = n/a[i];
                System.out.println(a[i] + " - " + sum);
                n = n-(a[i] * (n/a[i]));
            }
            i++;
            temp = n;
        }
    }


    public static int funcReturn(int n)
    {
        int[] a = {200,100,50,20,10,5,1};
        int temp = 1;
        temp = n;

        int i=0, sum = 0;
        while(temp>0)
        {
            sum =0;
            while(n/a[i]>=1)
            {
                sum = n/a[i];
                return sum;
                //n = n-(a[i] * (n/a[i]));
            }
            i++;
            temp = n;
        }
        return 0;
    }
}
