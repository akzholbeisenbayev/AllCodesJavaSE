package BitlabAcademy.ScannerVariables;

import java.util.Scanner;

//Напишите программу, в которой я ввожу числа a, b, c.
// Если число b находится между числами a и c, то программа выведет true, иначе false.

public class Task17
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean d = b>a && b<c;
        System.out.println(d);
    }
}
