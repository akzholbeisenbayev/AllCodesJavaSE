package BitlabAcademy.String;

import java.util.Scanner;

public class Task18
{
    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
//
//        String array= in.nextLine();
//
//        int count = 0;
//
//        for(int i=0;i<array.length();i++)
//        {
//            if (array.charAt(i) == 'a')
//            {
//               count++;
//                if(count%2==0) {
//                    array.replace(array.charAt(i), 'o');
//                }
//            }
//        }
//
//        for(int i=0; i<array.length(); i++)
//        {
//            System.out.print(array.charAt(i) + " ");
//        }

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] array = text.toCharArray();
        int count = 0;
        for(int i=0;i<array.length;i++)
        {
            if (array[i] == 'a')
            {
               count++;
                if(count%2==0) {
                    array[i] = 'o';
                }
            }
        }

        text = new String(array);
        System.out.println(text);
    }
}
