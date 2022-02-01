package ClientsFinal.zadacha6;

import java.util.Scanner;

//Вычислить значения функции z=sqrt((xi+ai)/2);
// если   и  - элементы массивов, состоящих из 40 элементов каждый.
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[20];

        System.out.println("Vvedite pervyi(a) massiv: ");
        for (int i = 0; i < 20; i++)
        {
            a[i] = cin.nextInt();
        }

        System.out.println("Vvedite vtoroi(b) massiv: ");
        for (int i = 0; i < 20; i++)
        {
            b[i] = cin.nextInt();
        }

        System.out.println("Vvedite treti(c) massiv: ");
        for (int i = 0; i < 20; i++)
        {
            c[i] = cin.nextInt();
        }

        double[] z = new double[20];


        for (int i = 0; i < 20; i++)
        {
            double d = a[i]*b[i]*c[i];
            z[i] = Math.cbrt(d /3);
        }

        System.out.println("Znachenya massiva Z: ");
        for (int i = 0; i < 20; i++)
        {
            System.out.print(z[i]+ " ");
        }
    }
}

