package BitlabAcademy.String;

import java.util.Scanner;

public class Task7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.charAt(0)==' ' && text.charAt(text.length()-1)==' '){
            System.out.println( "(" + text.trim()+ ")" );
        }
        else {
            System.out.println(text);
        }
    }
}
