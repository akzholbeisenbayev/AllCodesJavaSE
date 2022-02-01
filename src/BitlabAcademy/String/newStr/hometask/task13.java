package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;
import java.util.StringTokenizer;

public class task13
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        StringTokenizer newText = new StringTokenizer(text," ");


        while (newText.hasMoreTokens()){
            String sub = newText.nextToken();
            sub = sub.substring(0, 1).toUpperCase() + sub.substring(1);
            System.out.print(sub+" ");
        }
    }
}
