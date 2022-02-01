package Codeforces.D748Div3;

import java.util.Scanner;

public class A
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = 5;
        t = in.nextInt();

        long max = 0;
        long[] a = new long[3];
        int n = a.length;

        for(int j=0;j<t;j++){
            a = new long[3];
            n = a.length;

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            max = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }

            addValue(a, n, max);
        }




    }

    public static void addValue(long[] a, int n, long max)
    {
        for (int i = 0; i < n; i++) {
            if (a[i] != max)
                System.out.print((max - a[i] + 1) + " ");
            else
                System.out.print(0 + " ");
        }
        System.out.println();
    }
}
