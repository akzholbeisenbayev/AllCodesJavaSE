package BitlabAcademy.Methods.newPr.hometask;

import java.util.Scanner;

public class task2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        two(text);
    }

    public static void two(String text)
    {
        for(int i = 0; i < text.length(); i++)
            System.out.print(text.charAt(i)+""+text.charAt(i));
    }
}
