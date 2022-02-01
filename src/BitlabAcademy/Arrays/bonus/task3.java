package BitlabAcademy.Arrays.bonus;

import java.util.Scanner;

public class task3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean isTrue = false;
    int b =  0; //b=n

        for(int i=0; i<n-1; i++)
        {
            if((nums[i]>0 && nums[i+1]<0) || (nums[i]<0 && nums[i+1]>0))
            {
                b++;
                //isTrue = true;
            }else{
                b--;//isTrue=false;
                break;
            }
        }

//        if(isTrue)
//            System.out.println("YES");
//        else
//            System.out.println("NO");

        if(b==nums.length)
        {
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
