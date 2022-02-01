package BitlabAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        int[] a = new int[10]; //{{1,2,3,4},{4,4,5,6},...}

        int[][] arr = new int[3][3];

        //i = 2
        for(int i =0; i<3; i++)
        {
            //j = 0
            for(int j=0; j<3; j++)
            {
                //arr[2][0]
                arr[i][j] = in.nextInt();
            }
        }


        for(int i =0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

























//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
//        String b = scanner.next();
//        int temp = b.length()-1;
//        boolean isTrue=true;
//        for (int i =0; i <a.length(); i++) {
//            if(a.charAt(i)==b.charAt(temp))
//            {
//                isTrue=true;
//            }else
//                isTrue=false;
//            break;
//        }if (isTrue)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
    }
}
