package BitlabAcademy.Arrays;

import java.util.Scanner;

public class Task29
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int indexFirstZero = 0;

        for(int i=0; i<n; i++)
        {
            if(nums[i] == 0)
            {
                indexFirstZero = i;
                break;
            }
        }

        int sum = 0;
        for(int i=indexFirstZero+1; i<n; i++)
        {
            sum+=nums[i];
            if(nums[i]==0)
            {
                break;
            }
        }

        System.out.println(sum);
    }
}
