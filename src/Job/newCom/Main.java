package Job.newCom;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("___________________________________________________________________________");
        System.out.println("_________________________ПУНТ 7:_________________________");

        Account account3 = new Account(1122, "George", 1000);
        account3.setAIRate(1.5);

        account3.deposit(30);
        account3.deposit(40);
        account3.deposit(50);

        account3.withdraw(5);
        account3.withdraw(4);
        account3.withdraw(2);

        System.out.println("Account Summary:");
        System.out.println("Name: " + account3.getName());
        System.out.println("Interest rate: " + account3.getAIRate());
        System.out.println("Balance: " + account3.getBalance());
        System.out.println("All transactions: ");
        for(int i=0; i<account3.getList().size(); i++)
        {
            System.out.println(account3.getList().toString());
        }

        System.out.println("___________________________________________________________________________");
        System.out.println("_________________________ПУНТ 6:_________________________");


        Account account1 = new Account(0, "Zhanel", 100);
        Account account2 = new Account(1, "Aizada", 100);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        int acc = 6;
        while (acc != 4) {
            System.out.println();
            System.out.print("Enter an id: ");
            int id = in.nextInt();


            boolean isIDcorrect = false;

            for (int i = 0; i < accounts.size(); i++) {
                if (id == accounts.get(i).getId()) {
                    isIDcorrect = true;
                    break;
                }
            }
            if (isIDcorrect) {
                int temp = 6;
                while (temp != 4) {
                    System.out.println();
                    System.out.println("Main menu");
                    System.out.println("1: check balance");
                    System.out.println("2: withdraw");
                    System.out.println("3: deposit");
                    System.out.println("4: exit");

                    System.out.print("Enter a choice: ");
                    temp = in.nextInt();

                    if (temp == 1) {
                        System.out.println(accounts.get(id).getBalance());
                    } else if (temp == 2) {
                        System.out.print("Enter an amount to withdraw: ");
                        double amount = in.nextDouble();
                        accounts.get(id).withdraw(amount);
                    } else if (temp == 3) {
                        System.out.print("Enter an amount to deposit: ");
                        double amount = in.nextDouble();
                        accounts.get(id).deposit(amount);
                    } else if (temp == 4)
                        break;
                }
            }else
                System.out.println("The id is entered incorrectly, please, enter a correct id");
        }
    }
}
