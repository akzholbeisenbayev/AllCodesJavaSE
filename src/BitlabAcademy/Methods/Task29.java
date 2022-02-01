package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        test(N, M);
    }

    public static void test(int n, int m) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println(n * m);
        } else if (n % 2 != 0 && m % 2 != 0) {
            System.out.println(n + m);
        } else if (n % 2 == 0) {
            if (m % 2 != 0) {
                System.out.println(m);
            }
        } else if (m % 2 == 0) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
    }
}