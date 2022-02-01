package BitlabAcademy.Project1.GulbarshinsProject;

import java.util.Scanner;
public class CityBankATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CityBankAccount cityBankAccount;
        NationalBankAccount nationalBankAccount;
        System.out.println("Enter account number: ");
        String acNum = scanner.next();
        System.out.print("Enter PIN-code: ");
        String pin = scanner.next();
        int select = 6;
        while (select != 0) {
            for (int i = 0; i < Database.allAccounts.length; i++) {
                if (Database.allAccounts[i].getAccountNumber().equals(acNum) && Database.allAccounts[i].getPinCode().equals(pin)) {
                    if (Database.allAccounts[i].getAccountNumber().substring(0, 2).equals("KZ")) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                                "\n" +
                                "               PRESS [2] TO VIEW BALANCE \n" +
                                "\n" +
                                "               PRESS [3] TO CHANGE PIN CODE \n" +
                                "\n" +
                                "               PRESS [4] TO CASH IN ACCOUNT \n" +
                                "\n" +
                                "               PRESS [5] TO VIEW ACCOUNT DATA \n" +
                                "\n" +
                                "               PRESS [6] TO EXIT ");
                        select = scanner.nextInt();
                        switch (select) {
                            case 1:
                                System.out.println("Enter sum: ");
                                int credit = scanner.nextInt();
                                Database.allAccounts[i].creditBalance(credit);
                                break;
                            case 2:
                                System.out.println(Database.allAccounts[i].totalBalance());
                                break;
                            case 3:
                                System.out.println("Enter new pinCode: ");
                                String newPinCode = scanner.next();
                                Database.allAccounts[i].setPinCode(newPinCode);
                                break;
                            case 4:
                                System.out.println("Enter your cash: ");
                                int debet1 = scanner.nextInt();
                                Database.allAccounts[i].debetBalance(debet1);
                                break;
                            case 5:
                                Database.allAccounts[i].getAccountData();
                                break;
                            case 6:
                                break;
                        }
                        break;
                    }
                    if (Database.allAccounts[i].getAccountNumber().substring(0, 2).equals("NB")) {
                        System.out.println(" PRESS [1] TO CASH WITHDRAWAL\n" +
                                "\n" +
                                "               PRESS [2] TO VIEW BALANCE\n" +
                                "\n" +
                                "               PRESS [3] TO EXIT");
                        int b = scanner.nextInt();
                        switch (b) {
                            case 1:
                                System.out.println("Enter sum: ");
                                int credit = scanner.nextInt();
                                Database.allAccounts[i].setBalancee(credit);
                                break;
                            case 2:
                                Database.allAccounts[i].totalBalance();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("error");
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
}
