package ClientsFinal.zadacha9;

import java.util.Scanner;

//9 Дан упорядоченный по убыванию массив чисел.
// Вводим число N.
// Вставить это число в упорядоченный массив так, чтобы массив – результат тоже был упорядочен по убыванию.
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

        int[] b = new int[n+1];
        int g=0;
        for (int i = 0; i < n; i++)
        {
            b[g++] = a[i];
        }
        b[n] = n;

        bubbleSort(b);
        for (int i = 0; i <= n; i++)
        {
            System.out.print(b[i]+ " ");
        }
    }

    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
