package BitlabAcademy.String;

import java.util.Scanner;

public class Task21
{
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        num1 = reader.nextDouble();
        op = reader.next().charAt(0);
        num2 = reader.nextDouble();

        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            case '%': ans = num1 % num2;
                break;
            default:  System.out.print("Error");
                return;
        }
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
