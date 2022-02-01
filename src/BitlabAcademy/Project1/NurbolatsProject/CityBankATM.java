package BitlabAcademy.Project1.NurbolatsProject;


import BitlabAcademy.Project1.ErnarsProject.Database;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your Account Number : ");
        String insertAccountNumber = in.next();
        System.out.println("Insert your PINcode : ");
        String insertPIN = in.next();
        int w = 47;
        while(w!=6) {
            for (int i = 0; i < Database.allAccounts.length; i++) {

                if (insertAccountNumber.equals(Database.allAccounts[i].getAccountNumber()) &&
                        insertPIN.equals(Database.allAccounts[i].getPinCode())) {
                    if (insertAccountNumber.substring(0, 2).equals("CB")) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL\nPRESS [2] TO VIEW BALANCE\n" +
                                "PRESS [3] TO CHANGE PIN CODE\nPRESS [4] TO CASH IN ACCOUNT\n" +
                                "PRESS [5] TO VIEW ACCOUNT DATA\nPRESS [6] TO EXIT");
                        int number = in.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Insert your credit sum:");
                                int sum = in.nextInt();
                                Database.allAccounts[i].creditBalance(sum);
                                break;
                            case 2:

                                System.out.println("Your balance :" + Database.allAccounts[i].totalBalance());

                                break;
                            case 3:
                                System.out.println("Insert uour new pin:");
                                String newPin = in.next();
                                Database.allAccounts[i].setPinCode(newPin);
                                System.out.println("Vash pin ustanovlen");
                                break;
                            case 4:
                                System.out.println("Insert your credit sum:");
                                sum = in.nextInt();
                                Database.allAccounts[i].debetBalance(sum);
                            case 5:
                                System.out.println(Database.allAccounts[i].accountData());
                                break;

                            case 6:
                                break;

                        }
                        break;
                    }break;
                }

                else if (insertAccountNumber.substring(0, 2).equals("NB")) ;
                System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                        "PRESS [2] TO VIEW BALANCE\nPRESS [3] TO EXIT");
                int number = in.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("Insert your credit sum");
                        int sum = in.nextInt();
                        Database.allAccounts[i].creditBalance(sum - 200);
                        break;
                    case 2:
                        System.out.println("Your balance :" + Database.allAccounts[i].totalBalance());
                        break;

                    case 3:
                        break;


                }
            }
        }
    }
}
