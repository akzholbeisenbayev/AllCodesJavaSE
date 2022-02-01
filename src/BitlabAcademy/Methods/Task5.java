package BitlabAcademy.Methods;


//import java.util.Scanner;
//
//public class Task5 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        test (a,b);
//    }
//
//
//    public static void test(String str1,String str2) {
//        int count = 0;
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//        char b = str2.charAt(0);
//        for(int i =0; i<str1.length();i++){
//            if(str1.charAt(i) == b){count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count1 = 0;
        bit(count1);
    }
    public static void bit(int count2) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        name = name.toLowerCase();
        String input = in.next();
        input = input.toLowerCase();
        char c = input.charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}