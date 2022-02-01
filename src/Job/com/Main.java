package Job.com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = cin.nextInt();
        }
        System.out.println();

        System.out.println(Arrays.toString(massiv(array)));


    }

    public static int[] massiv(int[] a)
    {
        int n = a.length;
        int[] massiv = new int[2];

        for(int i=0; i<n; i++)
        {
            if(a[i]>0)
                massiv[0]++;
            if(a[i]==0)
                massiv[1]++;
        }

        return massiv;
    }
}