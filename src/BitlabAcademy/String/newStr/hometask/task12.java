package BitlabAcademy.String.newStr.hometask;

import java.util.Scanner;

public class task12
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int count = 0;

        for (int i=0; i<s1.length(); i++){
            if(Character.isAlphabetic(s1.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

    }
}
