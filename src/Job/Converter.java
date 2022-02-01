package Job;

import java.util.Scanner;

public class Converter
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("______________________________________________");
        System.out.println("Welcome to my currencies converter!");
        System.out.println();


        while(true)
        {
            System.out.println("Choose convertion: ");
            System.out.println(" PRESS [1] to convert RUB to KZT");
            System.out.println(" PRESS [2] to convert USD to KZT");
            System.out.println(" PRESS [3] to convert EUR to KZT");
            System.out.println(" PRESS [4] to convert CNY to KZT");
            System.out.println(" PRESS [5] to convert KZT to RUB");
            System.out.println(" PRESS [6] to convert KZT to USD");
            System.out.println(" PRESS [7] to convert KZT to EUR");
            System.out.println(" PRESS [8] to convert KZT to CNY");

            System.out.println();
            System.out.println("Choose one of the method to convert currencies");
            int choice = cin.nextInt();
            if(choice == 1)
            {
                System.out.print("Write how many RUB you want to convert to KZT: ");
                int rub = cin.nextInt();
                double kzt = rub * 5.6;
                System.out.println(rub + " RUB = " + kzt + " KZT");
            }
            else
            {
                if(choice == 2)
                {
                    System.out.print("Write how many USD you want to convert to KZT: ");
                    int usd = cin.nextInt();
                    double kzt = usd * 423.49;
                    System.out.println(usd + " USD = " + kzt + " KZT");
                }
                else
                {
                    if(choice == 3)
                    {
                        System.out.print("Write how many EUR you want to convert to KZT: ");
                        int eur = cin.nextInt();
                        double kzt = eur * 504.26;
                        System.out.println(eur + " USD = " + kzt + " KZT");
                    }
                    else
                    {
                        if(choice == 4)
                        {
                            System.out.print("Write how many CNY you want to convert to KZT: ");
                            int cny = cin.nextInt();
                            double kzt = cny * 64.41;
                            System.out.println(cny + " CNY = " + kzt + " KZT");
                        }
                        else
                        {
                            if(choice == 5)
                            {
                                System.out.print("Write how many KZT you want to convert to RUB: ");
                                int kzt = cin.nextInt();
                                double rub = kzt / 5.6;
                                System.out.println(kzt + " KZT = " + rub + " RUB");
                            }
                            else
                            {
                                if(choice == 6)
                                {
                                    System.out.print("Write how many KZT you want to convert to USD: ");
                                    int kzt = cin.nextInt();
                                    double usd = kzt / 423.49;
                                    System.out.println(kzt + " KZT = " + usd + " USD");
                                }
                                else
                                {
                                    if(choice == 7)
                                    {
                                        System.out.print("Write how many KZT you want to convert to EUR: ");
                                        int kzt = cin.nextInt();
                                        double eur = kzt / 504.26;
                                        System.out.println(kzt + " KZT = " + eur + " EUR");
                                    }
                                    else
                                    {
                                        if(choice == 8)
                                        {
                                            System.out.print("Write how many KZT you want to convert to CNY: ");
                                            int kzt = cin.nextInt();
                                            double cny = kzt / 64.41;
                                            System.out.println(kzt + " KZT = " + cny + " CNY");
                                        }
                                        else System.out.println("There is no that choice, please, choose other");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Do you want to do one more convertation?");
            //write YES, if you want
            //write NO, if you don't want
            String answer = cin.next();
            if(answer.equals("YES"))
            {
                continue;
            }
            if(answer.equals("NO"))
            {
                System.out.println("Thank you! Good bye!");
                break;
            }
            }
    }
}

