package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T46
{
    public static void main(String[] args)
    {


        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int d;
        int[] c ={2,7,1,8,2,8,1,8,2,8,4,5,9,0,4,5,2,3,5,3,6,0,2,8,7,5};
        if (n!=0)
        {
            for (d=0; d<=n; d++)
            {
                if (d==1) System.out.print('.');
                if (n!=25 && d==n && c[n+1]>=5 ) c[d]=c[d]+1;
                System.out.print(c[d]);
            }
        }
        else System.out.print(3);

    }
}
