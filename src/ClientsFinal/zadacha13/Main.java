package ClientsFinal.zadacha13;

import java.util.Scanner;

//Вывести на печать первый отрицательный элемент массива   и его порядковый номер,
// пологая, что в массиве есть хотя бы один отрицательный элемент.
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

        int index =0;
        for(int i=0; i<30; i++)
        {
            if(arr[i] < 0)
            {
                System.out.print(arr[i] + ", ego poryadkovyi nomer: " + i);
                break;
            }
        }


    }
}

