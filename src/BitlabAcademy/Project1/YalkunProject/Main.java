package BitlabAcademy.Project1.YalkunProject;

import BitlabAcademy.Project1.ErnarsProject.BankAccount;
import BitlabAcademy.Project1.ErnarsProject.CityBankAccount;
import BitlabAcademy.Project1.ErnarsProject.Database;
import BitlabAcademy.Project1.ErnarsProject.NationalBankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Debug card: KZ010322301, PIN: 2222"
                +"\nNationalBank card: KZ0101112, PIN: 3333"
        );

        BankAccount currentObject = insertAccNumber();
//        System.out.println(currentObject);
        System.out.println("INSERT YOUR PIN:");
        String num = in.next();
        Boolean isCorrect = false;
        if(currentObject.getPinCode().equals(num)){
            isCorrect = true;
        }
        int n = 9, sum =0;
        String pin;
        if (!isCorrect) System.out.println("PIN IS WRONG\nGOOD BYE !!!");
        else {
            while (n != 0){
                if(currentObject instanceof CityBankAccount){
                    menu1();
                }else
                    menu2();
                n = in.nextInt();

                switch (n){
                    case 1:
                        System.out.println("INPUT AMOUNT TO WITHDRAW:");
                        sum = in.nextInt();
                        if (currentObject.totalBalance()>sum){
                            currentObject.creditBalance(sum);
                            System.out.println("TAKE YOUR MONEY. BALANCE REMAINS:" + currentObject.totalBalance());
                        }else System.out.println("NOT ENOUGH MONEY");
                        break;
                    case 2:
                        System.out.println("BALANCE: "+currentObject.totalBalance());
                        break;
                    case 3:
                        System.out.println("INSERT NEW PIN:");
                        pin = in.next();
                        currentObject.setPinCode(pin);
                        System.out.println("NEW PIN IS:" + currentObject.getPinCode());
                        break;
                    case 4:
                        System.out.println("INPUT AMOUNT TO CASH IN:");
                        sum = in.nextInt();
                        currentObject.debetBalance(sum);
                        System.out.println("BALANCE REMAINS:" + currentObject.totalBalance());
                        break;
                    case 5:

                        System.out.println(currentObject.accountData());
                        break;
                    case 0:
                        break;
                }


            }
        }
    }

    public static void menu2(){
        System.out.println(
                "PRESS [1] TO CASH WITHDRAWAL"
                        +"\nPRESS [2] TO VIEW BALANCE"
                        +"\nPRESS [0] TO EXIT"
        );
    }

    public static void menu1(){
        System.out.println(
                "PRESS [1] TO CASH WITHDRAWAL"
                        +"\nPRESS [2] TO VIEW BALANCE"
                        +"\nPRESS [3] TO CHANGE PIN CODE"
                        +"\nPRESS [4] TO CASH IN ACCOUNT"
                        +"\nPRESS [5] TO VIEW ACCOUNT DATA"
                        +"\nPRESS [0] TO EXIT"
        );
    }

    public static BankAccount insertAccNumber(){
        System.out.println("INSERT YOUR CARD:");
        Scanner in = new Scanner(System.in);
        String num = in.next();
        BankAccount currentObject = null;
        BankAccount[] all = Database.allAccounts;

        for (int i = 0; i < all.length; i++) {
            if(all[i].getAccountNumber().equals(num)){
                if(all[i] instanceof CityBankAccount){
                    currentObject = (CityBankAccount) all[i];
                }else{
                    currentObject = (NationalBankAccount) all[i];
                }
            }
        }
        return currentObject;
    }


}