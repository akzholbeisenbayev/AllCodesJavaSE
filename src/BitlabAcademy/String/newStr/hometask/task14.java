package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;
import java.util.StringTokenizer;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String equation = in.nextLine();

        StringTokenizer st = new StringTokenizer(equation, " ");

        while(st.hasMoreTokens()) {
            String subText = st.nextToken();
            if (subText.equalsIgnoreCase("one")) {
                subText = "1";
            }
            if (subText.equalsIgnoreCase("two")) {
                subText = "2";
            }
            if (subText.equalsIgnoreCase("three")) {
                subText = "3";
            }
            if (subText.equalsIgnoreCase("four")) {
                subText = "4";
            }
            if (subText.equalsIgnoreCase("five")) {
                subText = "5";
            }
            if (subText.equalsIgnoreCase("six")) {
                subText = "6";
            }
            if (subText.equalsIgnoreCase("seven")) {
                subText = "7";
            }
            if (subText.equalsIgnoreCase("eight")) {
                subText = "8";
            }
            if (subText.equalsIgnoreCase("nine")) {
                subText = "9";
            }
            if (subText.equalsIgnoreCase("zero")) {
                subText = "0";
            }
            System.out.print(subText + " ");
        }
    }
}