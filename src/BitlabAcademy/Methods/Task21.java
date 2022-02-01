package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }


        test(N, array);
    }

    public static void test(int n, int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+"  ");
        }
    }
}
//import java.util.Scanner;
//
//public class Task21 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int [] array = new int[n];
//        for(int i =0;i< array.length;i++){
//            array[i]= in.nextInt();
//        }medhodArrays(n,array);
//    }
//    public static void medhodArrays(int n,int[] array){
//        int t = 0;
//        for (int i =0;i< array.length;i++){
//            for(int j =i+1;j< array.length;j++){
//                if(array[i]>array[j]){
//                    t=array[i];
//                    array[i]=array[j];
//                    array[j]=t;
//                }
//            }System.out.print(array[i]+" ");
//        }
//    }
//}
