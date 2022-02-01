package BitlabAcademy.String.practice;

import java.util.Scanner;

public class task10
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        char [] symbols = str1.toCharArray();
        for (int i=0;i<symbols.length;i++){
            if(Character.isUpperCase(symbols[i]))
            {
                symbols[i]=Character.toLowerCase(symbols[i]);
            }else
                {
                symbols[i]=Character.toUpperCase(symbols[i]);
            }
        }
        String str2 = String.valueOf(symbols);
        System.out.println(str2);

    }
}
