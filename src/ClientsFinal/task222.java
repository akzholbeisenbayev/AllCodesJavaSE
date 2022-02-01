package ClientsFinal;


//N өлшемді массив берілген.
// Серия деп қатар келе жатқан бірдей элементтердің тобын атаймыз,
// ал серияның ұзындығы деп – ол элементтердің санын (серияның ұзындығы 1 тең болуы мүмкін) белгілейміз..
// Берілген массивтің барлық серияларының ұзындығын қамтитын массив шығару.

import java.util.Scanner;

public class task222
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int []a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = cin.nextInt();

        int count=1;
        int []c = new int[count];

        for(int i=0; i<n-1; i++)
        {
            int temp = a[i];

            if(a[i]==a[i+1])
            {
                count++;
                c[count]++;
            }
        }


    }
}
