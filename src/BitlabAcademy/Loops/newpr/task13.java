package BitlabAcademy.Loops.newpr;

import java.util.Scanner;

public class task13
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        int max = Integer.MIN_VALUE;

        while (n!=0){
            n = in.nextInt();
            if(n==0) break;

            if (n>max){
                max=n;
            }
        }
        System.out.println(max);
    }
}
