package ClientsFinal.zadacha4;

//Дан массив чисел  . Расставить их по убыванию.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[60];
        for(int i=0; i<60; i++)
        {
            arr[i] = cin.nextInt();
        }
        bubbleSort(arr);
        int[] arr2 = new int[60];
        int g = 0;
        for(int i=59; i>=0; i--)
        {
           arr2[g++] = arr[i];
        }

        for(int i=0; i<60; i++)
        {
            arr[i] = arr2[i];
        }

        for(int i=0; i<60; i++)
        {
            System.out.print(arr[i] + " ");
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
