package ClientsFinal.zadacha10;

import java.util.Scanner;

//Даны два упорядоченных массива целых чисел A  и B .
// Слить их в один упорядоченный массив.
// Рассмотреть случай, когда массивы  A и  B упорядочены одинаково и когда по разному.
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.print("N: ");
        int n = cin.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = cin.nextInt();
        }

        System.out.print("M: ");
        int m = cin.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++)
        {
            b[i] = cin.nextInt();
        }

        int c[] = new int[n+m];
        int g = 0;
        for (int i = 0; i < n; i++)
        {
            c[g++] = a[i];
        }
        for (int i = 0; i < m; i++)
        {
            c[g++] = b[i];
        }

        bubbleSort(c);
        for (int i = 0; i < n+m; i++)
        {
            System.out.print(c[i] + " ");
        }

        System.out.println();
        if(a[0]>a[1] && b[0]>b[1])
        {
            System.out.println("massiv A i massiv B uporyadochani odynakogo");
        } else if(a[0]<a[1] && b[0]<b[1])
        {
            System.out.println("massiv A i massiv B uporyadochani odynakogo");
        }else if(a[0]>a[1] && b[0]<b[1])
        {
            System.out.println("massiv A i massiv B uporyadochani po raznomy");
        }else if(a[0]<a[1] && b[0]>b[1])
        {
            System.out.println("massiv A i massiv B uporyadochani po raznomy");
        }



    }

    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
