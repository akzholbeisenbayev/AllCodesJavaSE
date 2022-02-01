package BitlabAcademy.String;

import java.util.Scanner;

public class Task25
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String  s2 = "";
        s2 = s2 + s1.substring(0, 1).toUpperCase();
        for (int i = 1; i < s1.length(); i++) {
            if (" ".equals(s1.substring(i-1, i)))
                s2 = s2 + s1.substring(i, i+1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i+1);
        }
        System.out.println(s2);
    }
}
