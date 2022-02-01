package BitlabAcademy.ScannerNew.hard;

import java.util.Scanner;

public class task15
{
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
        int date = in.nextInt();//
        //1 января = четверг = 4+3=воскресенье
        int weekDay = (date+3)%7;
        System.out.println(weekDay);


//        Scanner in = new Scanner(System.in);
//        int r = in.nextInt();
//        int c1 = in.nextInt();
//        int c2 = in.nextInt();
//        int c3 = in.nextInt();
//        int b = in.nextInt();
//
//
//        double c11 = (b/c1) / r * 100;
//        double c22 = (b/c2) / r * 100;
//        double c33 = (b/c3) / r * 100;
//
//        System.out.println(c11);
//        System.out.println(c22);
//        System.out.println(c33);
    }
}
