package ACMPru.BeginnerLevel;

import java.util.Scanner;

public class T263
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int a,b,c;
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();
        int firsit=max(b,c)-min(b,c)-1;
        int secsit=a-max(b,c)+min(b,c)-1;
        System.out.println(min(firsit,secsit));
    }

    public static int max(int a, int b)
    {
        int max = 0;
        if (a>b) max = a;
        else if(a<b) max = b;
        return max;
    }

    public static int min(int a, int b)
    {
        int min = 0;
        if (a>b) min = b;
        else if(a<b) min = a;
        return min;
    }
}
