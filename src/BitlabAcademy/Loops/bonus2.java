package BitlabAcademy.Loops;

import java.util.Scanner;

public class bonus2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int sum = 0;
        int m;
        for (int i = 1; i <=w; i++) {
            sum += i*k;
        }
        m = sum-n;
        if (m>=0){
            System.out.println(m);
        }
        else {
            System.out.println("0");
        }
    }
}

