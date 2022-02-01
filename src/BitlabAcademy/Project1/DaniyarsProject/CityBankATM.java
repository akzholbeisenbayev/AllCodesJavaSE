package BitlabAcademy.Project1.DaniyarsProject;

import java.util.Scanner;

public class CityBankATM
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите номер счета:");
        String numverCash = in.next();
        System.out.println("Введите пин код:");
        String pin = in.next();

        for(int i = 0; i<Database.allAccounts.length; i++)
        {

            if (numverCash.equalsIgnoreCase(Database.allAccounts[i].getAccountNumber())
                    && pin.equalsIgnoreCase(Database.allAccounts[i].getPinCode()))
            {
                if(numverCash.substring(0,3).equals("KZC"))
                {
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL  // снять деньги" + "\n" +
                            " PRESS [2] TO VIEW BALANCE // просмотр баланса" + "\n" +
                            "  PRESS [3] TO CHANGE PIN CODE // изменить пин код" + "\n" +
                            " PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет" + "\n" +
                            "PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета" + "\n" +
                            " PRESS [6] TO EXIT // выход");
                    int san = in.nextInt();


                    switch (san) {
                        case 1:
                            System.out.println("Введите сумму:");
                            int creditJana = in.nextInt();
                            Database.allAccounts[i].creditBalance(creditJana);

                        case 2:
                            System.out.println(Database.allAccounts[i].totalBalance());

                        case 3:
                            String pinJana = in.next();
                            Database.allAccounts[i].setPinCode(pinJana);

                        case 4:
                            int akshaSalu = in.nextInt();
                            Database.allAccounts[i].debetBalance(akshaSalu);

                        case 5:
                            Database.allAccounts[i].accountData();

                        case 6:
                            break;
                    }
                }
                else if(numverCash.substring(0,3).equals("KZN"))
                {
                    System.out.println("Кош келдиниз санды танданыз:");
                    int san1 = in.nextInt();
                    switch (san1)
                    {
                        case 1:
                            System.out.println("Введите сумму:");
                            int creditJana = in.nextInt();
                            Database.allAccounts[i].creditBalance(creditJana);

                        case 2:
                            Database.allAccounts[i].totalBalance();

                        case 3:
                            break;
                    }
                }
                else
                    break;
            }
            else
                break;
        }

    }
}

