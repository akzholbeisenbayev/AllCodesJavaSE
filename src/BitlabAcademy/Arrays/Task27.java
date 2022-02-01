package BitlabAcademy.Arrays;

import java.util.Scanner;

public class Task27
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int indexMax = 0, indexMin = 0;
        for (int i = 0; i < n; i++)
        {
            if (nums[i] > max) {
                max = nums[i];
                indexMax = i;
            }

            if (nums[i] < min)
            {
                min = nums[i];
                indexMin = i;
            }
        }
        int temp = nums[indexMax];
        nums[indexMax] = nums[indexMin];
        nums[indexMin] = temp;

        for (int i = 0; i < n; i++)
        {
            System.out.print(nums[i] + " ");
        }

    }
}
