package BitlabAcademy.Loops;

import java.util.Scanner;

public class Task30
{
    public static void main(String[]args){
        Scanner in =  new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int a = 0;
        int sum = 0;

        for(int i =0;i<=w; i++)
        {
            if(1<=k && w<=1000 && n>=0 && n<=109)
            {
                sum+=i*k;
                a=sum-n;
            }
        }
        System.out.println(a);
    }
}
