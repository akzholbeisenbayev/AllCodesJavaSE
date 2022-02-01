package BitlabAcademy.Loops.newpr;

import java.util.Scanner;

public class task18
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++){
            sum += i*i;
        }
        System.out.println(sum);
    }
}
