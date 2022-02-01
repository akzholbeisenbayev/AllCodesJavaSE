package BitlabAcademy.Project1.ErnarsProject;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        CityBankAccount cityBankAccount;
        NationalBankAccount nationalBankAccount;

        System.out.println("Insert your credit card:");
        String account = in.next();
        System.out.println("Insert your pin code:");
        String pin = in.next();
        int a = 9;
        while(a!=3 && a!=6) {
            for (int i = 0; i < Database.allAccounts.length; i++) {
                if (account.equals(Database.allAccounts[i].getAccountNumber()) && pin.equals(Database.allAccounts[i].getPinCode())) {
                    if (Database.allAccounts[i].getAccountNumber().substring(0, 2).equals("KZ")) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL" + "\n" + "PRESS [2] TO VIEW BALANCE" + "\n" + "PRESS [3] TO CHANGE PIN CODE" + "\n" + "PRESS [4] TO CASH IN ACCOUNT" + "\n" + "PRESS [5] TO VIEW ACCOUNT DATA" + "\n" + "PRESS [6] TO EXIT");
                        a = in.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Insert sum:");
                                int sum = in.nextInt();
                                Database.allAccounts[i].creditBalance(sum);
                                break;
                            case 2:
                                System.out.println("Your balance:" + Database.allAccounts[i].totalBalance());
                                break;
                            case 3:
                                System.out.println("Insert new pin code:");
                                String newpin = in.next();
                                Database.allAccounts[i].setPinCode(newpin);
                                System.out.println("pin has successfully changed");
                                break;
                            case 4:
                                System.out.println("Insert sum:");
                                int sum1 = in.nextInt();
                                Database.allAccounts[i].debetBalance(sum1);
                                break;
                            case 5:
                                System.out.println(Database.allAccounts[i].getAccountNumber());
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("there is no that case");
                        }
                        break;
                    }
                    if (Database.allAccounts[i].getAccountNumber().substring(0, 2).equals("RK")) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL" + "\n" + "PRESS [2] TO VIEW BALANCE" + "\n" + "PRESS [3] TO EXIT");
                        a = in.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Insert sum:");
                                int sum = in.nextInt();
                                Database.allAccounts[i].creditBalance(sum + 200);
                                break;
                            case 2:
                                System.out.println("Your balance:" + Database.allAccounts[i].totalBalance());
                                break;
                            case 3:
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
}