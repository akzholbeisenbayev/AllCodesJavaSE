package BitlabAcademy.Methods;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();

        }
        test(N,array);
    }

    public static void test(int n, int[] arr) {
        int sum=0;
        for (int i = 0; i < n; i++) {

            if (arr[i]%2==0 && arr[i]<11) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);

    }
}