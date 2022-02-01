package BitlabAcademy.IfELse;

import java.util.Scanner;

public class Task30
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your branch:  \n 1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport: ");
        int a = scanner.nextInt();
        if (a == 1)
        {
            System.out.println("1 - Match, 2 - Physics: ");
            int b = scanner.nextInt();
            switch (b)
            {
                case 1:
                    System.out.println("You are Financier");
                    break;
                case 2:
                    System.out.println("You are Engineer");
                    break;
                default:
                    System.out.println("error");
            }

        }
        else if (a==2)
        {
            System.out.println("1 - History, 2 - Foreign Languages: ");
            int c = scanner.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("You are Historic or Diplomat ");
                    break;
                case 2:
                    System.out.println("You are Translator");
                    break;
                default:
                    System.out.println("error");
            }
        }
        else if(a==3)
        {
            System.out.println("1 - Drawing, 2 - Singing: ");
            int d = scanner.nextInt();
            switch (d)
            {
                case 1:
                    System.out.println("You are Painter or Architect");
                    break;
                case 2:
                    System.out.println("You are Singer or Tamada");
                    break;
                default:
                    System.out.println("error");
            }
        }
        else if (a==4)
        {
            System.out.println("1 - Team, 2 - Individual: ");
            int e = scanner.nextInt();
            switch (e)
            {
                case 1:
                    System.out.println("You are footballer or Basketball player");
                    break;
                case 2:
                    System.out.println("You are boxer or tennis player");
                    break;
                default:
                    System.out.println("error");
            }
        }

    }
}
