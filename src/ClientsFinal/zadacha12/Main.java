package ClientsFinal.zadacha12;

import java.util.Scanner;

//Вывести на печать положительные элементы массива
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[45];

        for(int i=0; i<45; i++)
        {
            arr[i] = cin.nextInt();
        }

        for(int i=0; i<45; i++)
        {
            if(arr[i] >= 0)
            {
                System.out.print(arr[i] + " ");
            }
        }


    }
}
