package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;

public class task10
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next(); //3A

        String digit = String.valueOf(s1.charAt(0)); //"3"
        String letter = String.valueOf(s1.charAt(1)); //"A"

        int digit2 = Integer.parseInt(digit) *2; //3*2 = 6

        s1 = letter+digit2; //A6

        System.out.println(s1); //A6

    }
}
