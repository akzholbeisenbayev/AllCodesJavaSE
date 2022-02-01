package BitlabAcademy.Methods;


import java.util.Scanner;

public class Task23
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = in.nextInt();

            }
        }test(N,array);
    }

    public static void test(int n, int[][] arr) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }

    }
}

//import java.util.Scanner;
//
//public class Task23 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int [] [] array = new int[N][N];
//        for(int i = 0;i< array.length;i++)
//            for(int j=0;j< array.length;j++){
//                array[i][j]= in.nextInt();
//            }
//        methodArrays(N,array);
//    }
//    public static void methodArrays(int N,int [][] array){
//        for(int i = 0;i< array.length;i++){
//            for(int j =0;j< array.length;j++){
//                if(i==j){
//                    System.out.print(array[i][j]+" ");}
//            }
//            System.out.println();
//        }
//    }
//}