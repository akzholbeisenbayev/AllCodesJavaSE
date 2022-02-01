package BitlabAcademy.String;

import java.util.Scanner;

public class Task23
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String temp = "";
        for(int i =0; i<s1.length(); i++){
            char a = s1.charAt(i);
            if(s1.charAt(i)=='1'|| s1.charAt(i)=='2' ||s1.charAt(i)=='3' || s1.charAt(i)=='4' || s1.charAt(i)=='5' || s1.charAt(i)=='6' || s1.charAt(i)=='7'
                    || s1.charAt(i)=='8' || s1.charAt(i)=='9'){
                temp = s1.replace(s1.charAt(i), '0');
                //Bit0015lab
                //Bit2015lab
                //Bit2005lab
                //Bit0000lab
            }
        }System.out.println(temp);
    }
}
