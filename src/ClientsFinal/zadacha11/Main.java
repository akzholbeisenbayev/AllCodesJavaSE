package ClientsFinal.zadacha11;

import java.util.Scanner;

//Дан массив чисел  . Найти сумму трех минимальных элементов.
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[30];
        for(int i=0; i<30; i++)
        {
            arr[i] = cin.nextInt();
        }

        int min = 2000000, index1 = 0, index2 = 0, index3 = 0;
        for(int i=0; i<30; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
                index1 = i;
            }
        }

        min = 2000000;
        for(int i=0; i<30; i++)
        {
            if (arr[i] < min && arr[i]>arr[index1])
            {
                min = arr[i];
                index2 = i;
            }
        }

        min = 2000000;
        for(int i=0; i<30; i++)
        {
            if (arr[i] < min && arr[i]>arr[index2])
            {
                min = arr[i];
                index3 = i;
            }
        }



        int sum = arr[index1] + arr[index2] + arr[index3];
        System.out.println("Summa 3 min elementov: " + sum);


    }
}
