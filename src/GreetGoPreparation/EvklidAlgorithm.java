package GreetGoPreparation;

public class EvklidAlgorithm
{
    public static void main(String[] args)
    {
        int a = 36, b = 32;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

   public static int gcd(int a, int b)
   {
       while(b!=0)
       {
           int temp = a%b;
           a = b;
           b = temp;
       }
       return a;
   }

   public static int lcm(int a, int b)
   {
       return a/gcd(a,b)*b;
   }
}
