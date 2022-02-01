package GreetGoPreparation;

import java.util.Scanner;

public class Palindrom
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n)
    {
        int temp = n;
        int reminder = 0, reverse = 0;

        while(n != 0)
        {
            reminder = n%10;
            reverse = reverse*10 + reminder;
            n = n / 10;
        }

        return temp == reverse;
    }

}
