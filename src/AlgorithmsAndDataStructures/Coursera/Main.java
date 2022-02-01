import java.util.Scanner;


public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        double radian = (n*3.14)/180;
        System.out.println(CosX(radian));
    }

    public static double CosX(double rad)
    {
        int i=2, s=1;
        double cos = 5;
        while(cos>=1 || cos<=-1)
        {
            cos = 1 - (Math.pow(rad, i)/Factorial(i) * s);
            s*=-1;
            i+=2;
        }
        return cos;
    }
    public static long Factorial(int g)
    {
        long f=1;
        for(int i=1; i<=g; i++)
        {
            f*=i;
        }
        return f;
    }
}