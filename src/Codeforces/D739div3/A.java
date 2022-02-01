package Codeforces.D739div3;

import java.util.Scanner;

public class A
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t=5;
        t = in.nextInt();
        while(t>0)
        {
            int k = in.nextInt();
            three(k);
            t--;
        }
    }

    public static int three(int k)
    {

        int[]arr = new int[1001];
        int n = arr.length;
        int j=0;
        for(int i=1; i<1667; i++)
        {
            if(i%3!=0 || i/10!=3)
            {
                arr[j] = i;
                j++;
            }
        }

        return arr[k+1];
    }
}
