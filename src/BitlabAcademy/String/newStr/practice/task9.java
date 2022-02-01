package BitlabAcademy.String.newStr.practice;

import java.util.Scanner;

public class task9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next(); //
        String s2 = in.next();
        String s3 = "";

        for (int i= s2.length()-1; i>=0; i--){
            s3 += s2.charAt(i);

        }

        if (s1.equals(s3)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
