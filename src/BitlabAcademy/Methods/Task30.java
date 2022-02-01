package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }
        int M = in.nextInt();

        test(N, array, M);
    }

    public static void test(int n, int[] arr, int m) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i && arr[i] % m != 0 ){
                System.out.println(arr[i]);
            }
        }
    }
}