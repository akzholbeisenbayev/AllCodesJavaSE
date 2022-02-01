package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;

public class task9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next(); //kazak //2
        String s2 = ""; //kazak

        s1 = s1.toLowerCase(); //Kazak -> kazak

        for (int i= s1.length()-1; i>=0; i--)
        {
            s2 =  s2+s1.charAt(i); //z
        }

        if(s1.equals(s2)){
            System.out.println("YES");
        }else {
            System.out.print("NO");
        }
    }
}
