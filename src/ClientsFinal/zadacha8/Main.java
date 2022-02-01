package ClientsFinal.zadacha8;

//В коллекции нумизмата не более чем 90 монет всех возможных достоинств.
// Определить, сколько монет достоинств в 20 и 50 рублей, и каковы их порядковые номера.

import java.util.Scanner;

//1 2 5 10 20 25 50
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Skolko vsego monet: ");
        int n = cin.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = cin.nextInt();
        }

        int sumOf20 = 0, sumOf50 = 0;
        for(int i=0; i<n; i++)
        {
            if(a[i] == 20) sumOf20++;
            if(a[i] == 50)  sumOf50++;
        }

        System.out.println("Kolichestvo monet 20 publevyh: " + sumOf20);
        System.out.println("Kolichestvo monet 50 publevyh: " + sumOf50);
    }
}
