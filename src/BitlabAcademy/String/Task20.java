package BitlabAcademy.String;

import java.util.Scanner;

public class Task20
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        String s = in.next();
        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            if (Character.isDigit(a)) {
                int b = Integer.parseInt(String.valueOf(a));
                sum=sum+b;
            }
        }
        System.out.println(sum*2);}
}
