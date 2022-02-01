package BitlabAcademy.Arrays;

import java.util.Scanner;

public class task6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        int a=0,b=0;
        for(int i =0;i<n;i++){
            nums[i] = in.nextInt();
        }

        for(int i = 0;i<n;i++)
        {
            if (nums[i]%2==0) {
                a=a+i; //45.0
                b++; //5.0
            }
        }


        System.out.println(a/b);
    }
}
