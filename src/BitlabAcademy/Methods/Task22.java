package BitlabAcademy.Methods;

import java.util.Scanner;
public class Task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String [] array = new String[a];
        for(int i =0;i<array.length;i++){
            array[i]=in.next();
        }
        String S = in.next();
        findS(a,array,S);
    }
    public static void findS(int a,String[]array,String S) {
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            if (S.equals(array[i])){
                isTrue = true;
                break;
            }
        }if(isTrue){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }}
}
