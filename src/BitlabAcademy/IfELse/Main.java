package BitlabAcademy.IfELse;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error");
        }


        String dayValue = "";

        switch (day) {
            case 1:
                dayValue = "Monday";
                break;
            case 2:
                dayValue = "Tuesday";
                break;
            case 3:
                dayValue = "Wednesday";
                break;
            case 4:
                dayValue = "Thursday";
                break;
            case 5:
                dayValue = "Friday";
                break;
            case 6:
                dayValue = "Saturday";
                break;
            case 7:
                dayValue = "Sunday";
                break;
            default:
                dayValue = "No day";
        }
        System.out.println(dayValue);



    }
}
