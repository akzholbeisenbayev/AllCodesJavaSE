package BitlabAcademy.Arrays;

import java.util.Scanner;

public class Task28
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                a++;
            }
        }
        int numsEven[] = new int[a];
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                numsEven[b] = nums[i];
                b++;
            }
        }for (int j = 0; j < a; j++) {
            System.out.print(numsEven[j]+" ");
        }
    }
}
