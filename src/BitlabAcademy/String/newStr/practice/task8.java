package BitlabAcademy.String.newStr.practice;

import java.util.Scanner;

public class task8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine(); //"asfasfasfsfsa fasfsa"
        int sum = 0;
        char c = 'a';
        for(int i=0; i<text.length(); i++)
        {
            //text.charAt(2) = 5
            if (Character.isDigit(text.charAt(i))) //true
            {
                sum = sum + Integer.parseInt(text.charAt(i) + ""); //"5" -> 5
            }
        }
        System.out.println(sum); //2+5=7
    }
}
