package ClientsFinal.zadacha2;

//Дан массив чисел  .
//Найти, сколько в нем пар одинаковых соседних элементов.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i=0; i<20; i++)
        {
            arr[i] = cin.nextInt();
        }

        int count = 0;
        for(int i=0; i<19; i++)
        {
           if(arr[i] == arr[i+1])
           {
               count++;
           }
        }
        System.out.println("Par odynakovyh sosednih elementov: " + count);

    }
}
