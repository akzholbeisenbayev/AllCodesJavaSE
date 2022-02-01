package ClientsFinal.zadacha3;

import java.util.Scanner;

//Дан массив чисел  .
// Найти наибольший элемент, поставить его первым.
public class Main
{
    public static void main()
    {
        Scanner cin = new Scanner(System.in);

        int[] arr = new int[50];
        for(int i=0; i<50; i++)
        {
            arr[i] = cin.nextInt();
        }

        int max = -200000, index = 0;
        for(int i=0; i<50; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
