package BitlabAcademy.Arrays;

import java.util.Scanner;

public class Task30
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean isTrue = false;

        for(int i=0; i<n-1; i++)
        {
            if((nums[i]>0 && nums[i+1]<0) || (nums[i]<0 && nums[i+1]>0))
            {
                isTrue = true;
            }else{
                isTrue=false;
                break;
            }
        }

        if(isTrue)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
