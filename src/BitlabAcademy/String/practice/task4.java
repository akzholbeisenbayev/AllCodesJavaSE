package BitlabAcademy.String.practice;

import java.util.Scanner;

public class task4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        word = word.toLowerCase();

        if(word.equals("java"))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
