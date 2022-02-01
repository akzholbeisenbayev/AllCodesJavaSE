package GreetGoPreparation.Sorts;


import java.util.Scanner;

public class QuickSort
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int [] a = {9,8,7,6,5,4,3,2,1};
        quickSort(a, 0, a.length-1);

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void quickSort(int[] a, int l, int r)
    {
        if(l<r)
        {
            int x = a[(l+r)/2];
            int i = l;
            int j = r;
            while(i<=j)
            {
                while(a[i]<x) i++;
                while(a[j]>x) j--;

                if(i<=j)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            quickSort(a,l,j);
            quickSort(a,i,r);
        }
    }

}
