package ClientsFinal.zadacha1;

import java.util.Scanner;

//Дан массив чисел  .
// Найти значение максимального элемента.
// Если таких элементов несколько,
// то определить сколько их. массива и сумму положительных элементов, расположенных до максимального.
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

        int max = -200000, index = 0;
        for(int i=0; i<60; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Maximum element: " + max);

        arr[0] = arr[index];
        for(int i=0; i<60; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

}
