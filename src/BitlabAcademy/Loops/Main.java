package BitlabAcademy.Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt(); //17
        int sum = 0;

        //k=a=3
        for (int i = 1; i <= c; i++) { //1 до 4 (банан)
            sum += a * i; //3 + 2*a=6 +9+12 = 30
        }

        if (sum >= b) {
            System.out.println(sum - b);
        }
        else {
            System.out.println(0);
        }

    }
}
