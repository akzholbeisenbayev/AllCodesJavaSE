package ClientsFinal.zadacha14;

import java.util.Scanner;

//Вывести на печать номера элементов массива  , удовлетворяющих условию
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        float[] array = new float[100];

        for(int i=0; i<100; i++)
        {
            array[i] = cin.nextFloat();
        }

        for(int i=0; i<100; i++)
        {
            if(array[i] > 0.0 && array[i] < 1.0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
