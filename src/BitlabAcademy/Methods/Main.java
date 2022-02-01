package BitlabAcademy.Methods;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //str2 = str1(обратный)
        //str2.equals(str1)

        String text = in.next(); //Hello -> hello
        text = text.toLowerCase();
        isPalindrom(text);

    }

    public static void isPalindrom(String str)
    {
        String text2 = "";  //olleh

        for (int i = str.length() - 1; i >= 0; i--)
        {
            text2 += str.charAt(i); //o+l+l+e+h
        }

        if(str.equals(text2))
        {
            System.out.println("YES");
        }else
            System.out.println("NO");

    }

}









//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String[] fruits = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            fruits[i] = in.next();
//        }
//        String s = in.next();
//        test(n, fruits, s);
//    }
//
//    public static void test(int n, String[] strs, String s) {
//        boolean isTrue = true;
//
//
//        for (int i = 0; i < n; i++) {
//            if (strs[i].equals(s)) {
//                isTrue = true;
//                break;
//            } else {
//                isTrue = false;
//            }}
//        if (isTrue) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

