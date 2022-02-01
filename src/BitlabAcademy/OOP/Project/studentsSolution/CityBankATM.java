package BitlabAcademy.OOP.Project.studentsSolution;

import java.util.Scanner;

public class CityBankATM
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String accountNumber;
        String pinCode;
        int a;
        System.out.print("ENTER ACCOUNT NUMBER: ");
        accountNumber = in.next();
        System.out.print("ENTER PIN CODE: ");
        pinCode = in.next();
        for (int counter = 0; counter < 10; counter++) {
            if (Database.allAccounts[counter].getAccountNumber().equals(accountNumber) && Database.allAccounts[counter].getPinCode().equals(pinCode)) {
                if (Database.allAccounts[counter] instanceof CityBankAccount) {
                    do {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                                "PRESS [2] TO VIEW BALANCE\n" +
                                "PRESS [3] TO CHANGE PIN CODE\n" +
                                "PRESS [4] TO CASH IN ACCOUNT\n" +
                                "PRESS [5] TO VIEW ACCOUNT DATA\n" +
                                "PRESS [6] TO EXIT");
                        a = in.nextInt();
                        if (a == 1) {
                            int credit;
                            System.out.print("HOW MUCH MONEY YOU WANT TO WITHDRAW: ");
                            credit = in.nextInt();
                            ((CityBankAccount) Database.allAccounts[counter]).creditBalance(credit);
                        }
                        if (a == 2) {
                            System.out.println("YOUR BALANCE: " + ((CityBankAccount) Database.allAccounts[counter]).totalBalance());
                        }
                        if (a == 3) {
                            String code = in.next();
                            ((CityBankAccount) Database.allAccounts[counter]).setPinCode(code);
                        }
                        if (a == 4) {
                            int debet = in.nextInt();
                            ((CityBankAccount) Database.allAccounts[counter]).debetBalance(debet);
                        }
                        if (a == 5) {
                            System.out.println(((CityBankAccount) Database.allAccounts[counter]).getUserData());
                        }
                        if(a == 6)
                        {
                            return;
                        }
                    }
                    while (a != 6);
                }
                else
                {
                    int c;
                    do
                    {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                                "PRESS [2] TO VIEW BALANCE\n" +
                                "PRESS [3] TO EXIT");
                        c = in.nextInt();
                        if(c == 1)
                        {
                            System.out.print("HOW MUCH MONEY YOU WANT TO WITHDRAW: ");
                            int credit = in.nextInt();
                            ((NationalBankAccount)Database.allAccounts[counter]).creditBalance(credit + 200);
                        }
                        if(c == 2)
                        {
                            System.out.println("YOUR BALANCE: " + ((NationalBankAccount)Database.allAccounts[counter]).totalBalance());
                        }
                        if(c == 3)
                            return;
                    }while(c != 0);
                }
            }
        }
    }
}