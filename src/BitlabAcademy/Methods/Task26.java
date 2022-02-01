package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();

        }int M = in.nextInt();
        test(N,M,array);
    }

    public static void test(int n,int m, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > m) {
                arr[i]=sum;
            }System.out.print(arr[i]+" ");
        }
    }}
