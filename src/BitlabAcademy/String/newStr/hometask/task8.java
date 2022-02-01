package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;

public class task8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int count = 0;

        for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i)=='a' ||
                    text.charAt(i)=='e' ||
                    text.charAt(i)=='i' ||
                    text.charAt(i)=='o' ||
                    text.charAt(i)=='u')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
