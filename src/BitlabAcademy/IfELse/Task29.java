package BitlabAcademy.IfELse;

import java.util.Scanner;

public class Task29
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert amount in KZT:");
        double a = in.nextDouble();

        System.out.println("Choose currency:");
        System.out.println("[1] USD");
        System.out.println("[2] EUR");
        System.out.println("[3] RUB");

        int b = in.nextInt();
        if(b==1){
            System.out.println((a=a/420) + " USD");
        }else if(b==2)
        {
            System.out.println((a=a/510) + " EUR");
        }else if(b==3){
            System.out.print((a=a/5.8) + " RUB");
        }
    }
}
