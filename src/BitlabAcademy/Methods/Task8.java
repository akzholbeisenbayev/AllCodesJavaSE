package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task8
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        ifIsIn(s1, s2);
    }

    public static void ifIsIn(String s1, String s2) {
        boolean isTrue = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.contains(s2)) {
                isTrue = true;
                break;
            } else
                isTrue = false;
        }
        if (isTrue)
            System.out.println("Yes");
        else {
            System.out.println("NO");
        }
    }
}