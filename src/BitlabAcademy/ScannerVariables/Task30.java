package BitlabAcademy.ScannerVariables;

import java.util.Scanner;

//Дано трехзначное число. Вывести вначале его последнюю цифру (единицы), а затем - его среднюю цифру (десятки).

public class Task30
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a%10);
        System.out.println(a/10%10);
    }
}
