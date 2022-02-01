package BitlabAcademy.String.newStr.practice;

import java.util.Scanner;

public class task10
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char s[] = str.toCharArray();

        for(int i = 0; i < s.length; i++)
        {
            if(Character.isLowerCase(s[i]))
            {
                s[i] = Character.toUpperCase(s[i]);
            }
            else
            {
                s[i] = Character.toLowerCase(s[i]);
            }
        }
        String s1 = String.valueOf(s);
//        String s1 = new String(s);
        System.out.println(s1);
    }
}
