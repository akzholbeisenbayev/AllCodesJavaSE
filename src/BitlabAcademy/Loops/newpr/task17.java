package BitlabAcademy.Loops.newpr;

import java.util.Scanner;

public class task17
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;

        //1+1/2+ 1/3+ 1/4..
        for (int i=1; i<=n; i++){
            sum += 1.0/i; //1+0+0 0.4
        }
        System.out.println(sum);


    }
}
