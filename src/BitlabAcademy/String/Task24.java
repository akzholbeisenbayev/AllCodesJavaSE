package BitlabAcademy.String;

import java.util.Scanner;

public class Task24
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (Character.isAlphabetic(a.charAt(i)) && !Character.isDigit(a.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
