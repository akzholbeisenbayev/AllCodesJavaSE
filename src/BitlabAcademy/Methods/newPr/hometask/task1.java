package BitlabAcademy.Methods.newPr.hometask;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ifEven(n);
    }

    public static void ifEven(int n) {
        if (n % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
