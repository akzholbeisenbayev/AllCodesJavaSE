package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;

public class task11
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();

        char[] s2 = s1.toCharArray();

        for (int i=0; i<s2.length; i++){
            if(Character.isDigit(s2[i])){
                s2[i] = '0';
            }
        }

        s1 = new String(s2);

        System.out.println(s1);

    }
}
