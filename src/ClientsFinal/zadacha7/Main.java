package ClientsFinal.zadacha7;

import java.util.Scanner;

//Известны данные о среднемесячной температуре за год.
// Определить, какая была самая высокая температура летом и самая низкая зимой
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[12];

        System.out.println("Vvedite massiv: ");
        for (int i = 0; i < 12; i++)
        {
            a[i] = cin.nextInt();
        }

         int maxTempLetom = -50;
        for(int i=5; i<8; i++)
        {
            if(a[i]>maxTempLetom)
            {
                maxTempLetom = a[i];
            }
        }

        System.out.println("Maximalnaya temperatura letom: " + maxTempLetom);

        int minTempZimoi = 500;
        for(int i=0; i<2; i++)
        {
            if(a[i]<minTempZimoi)
            {
                minTempZimoi = a[i];
            }
        }

        if(a[11]<minTempZimoi)
        {
            minTempZimoi = a[11];
        }

        System.out.println("Minimalnaya temperatura zimoi: " + minTempZimoi);
    }
}
