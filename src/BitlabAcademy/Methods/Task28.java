package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();

        }
        test(N,array);
    }

    public static void test(int n,int[] arr) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length; i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }for(int i = 0;i<arr.length; i++){
            if (arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println(min+max);
    }
}