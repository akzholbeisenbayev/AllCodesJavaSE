package BitlabAcademy.String.newStr.practice;

import java.util.Scanner;

public class task7
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine(); //Java Java

        char[] c = s.toCharArray(); //{'J', 'o', 'v', '0', ' ', 'J', 'a', 'v', 'a'}

        for (int i = 0; i < s.length(); i++) {
            if (c[i] == 'a') //c[3] = 'a' == 'a'
                c[i] = 'o';
        }

        s = new String(c);


        System.out.println(s);
    }
}
