package ClientsFinal.zadacha5;

import java.util.Scanner;

//Вычислить значения функции z=sqrt((xi+ai)/2);
// если   и  - элементы массивов, состоящих из 40 элементов каждый.
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int[] x = new int[40];
        int[] a = new int[40];

        System.out.println("Vvedite pervyi massiv: ");
        for (int i = 0; i < 40; i++)
        {
            x[i] = cin.nextInt();
        }

        System.out.println("Vvedite vtoroi massiv: ");
        for (int i = 0; i < 40; i++)
        {
            a[i] = cin.nextInt();
        }

        float[] z = new float[40];


        for (int i = 0; i < 40; i++)
        {
            z[i] = (float) Math.sqrt((x[i] + a[i])/2);
        }

        System.out.println("Znachenya massiva Z: ");
        for (int i = 0; i < 40; i++)
        {
            System.out.print(z[i]+ " ");
        }
    }
}
