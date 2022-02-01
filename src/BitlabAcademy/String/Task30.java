package BitlabAcademy.String;

import java.util.Scanner;

public class Task30
{
    public static void main(String[] args) {
        Scanner Aibek  = new Scanner(System.in);
        String str3 = Aibek.nextLine();
        String[] words = str3.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (int i=0; i<words.length; i++) {
            char[] tempCharArray = new char[words[i].length()];
            char[] charArray = new char[words[i].length()];

            for (int j = 0; j < words[i].length(); j++) {
                tempCharArray[j] = words[i].charAt(j);
            }
            for (int k = 0; k< words[i].length(); k++){
                charArray[k] = tempCharArray[words[i].length() - 1 - k];
            }
            String reverseWord = new String(charArray);
            newStr.append(reverseWord);
            newStr.append(" ");
        }
        System.out.println(newStr);
    }
}
