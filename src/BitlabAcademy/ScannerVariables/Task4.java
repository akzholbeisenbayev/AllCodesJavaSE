package BitlabAcademy.ScannerVariables;

import java.util.Scanner;

//Напишите программу, в которой я запрашиваю имя,
// фамилию, возраст, страну, и в конце программа
// выводит данные пользователя в консоль.

public class Task4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String surname = in.next();
        int age = in.nextInt();
        String country = in.next();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

    }
}
