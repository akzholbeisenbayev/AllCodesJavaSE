package BitlabAcademy.ScannerNew;

import java.util.Scanner;

public class task41 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int c1 = num%10;  //4
        int c2  = num/10 % 10; //3

        System.out.println((num % 10) + (num / 10) % 10 + (num / 100));

        //1234 %10 =(4)
        //1234/100 = 123 % 10 = (3)
        //1234 /10 = 12 % 10 =  (2)
      //1234 / 1000 =  (1)

        //345/10= 34 + (5)
        //345/10= 34/10 =  3 + (4)
        //345/100 = 3
        //3 + 4 +5
    }
}