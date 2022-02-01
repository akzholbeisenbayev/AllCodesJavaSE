package BitlabAcademy.OOP.Project.rightSolution;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String account = in.next();
        System.out.print("Enter PIN-code: ");
        String pincode = in.next();

        int index =0;
        for(int i = 0; i< Database.allAccounts.length; i++){
            if(Database.allAccounts[i].getAccountNumber().equals(account)){
                index = i;
            }
        }

        if(Database.allAccounts[index].getPinCode().equals(pincode)){
            if (Database.allAccounts[index] instanceof CityBankAccount) {
                int temp = 0;
                while (temp!=6) {
                    System.out.println("------------------------------------------------");
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                    System.out.println("PRESS [2] TO VIEW BALANCE");
                    System.out.println("PRESS [3] TO CHANGE PIN CODE");
                    System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                    System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                    System.out.println("PRESS [6] TO EXIT");
                    System.out.println("------------------------------------------------");
                    temp = in.nextInt();
                    if(temp==1){
                        System.out.print("Enter the amount:");
                        int amount = in.nextInt();
                        if (Database.allAccounts[index].totalBalance()>=amount) {
                            Database.allAccounts[index].debetBalance(amount);
                        }else{
                            System.out.println("You don't have enough funds in your balance");
                        }
                    }else if(temp==2){
                        System.out.println(Database.allAccounts[index].totalBalance());
                    }else if(temp==3){
                        System.out.print("Enter new pin: ");
                        String newPin = in.next();
                        Database.allAccounts[index].setPinCode(newPin);
                    }else if(temp==4){ ;
                        System.out.print("Enter the amount:");
                        int amount=in.nextInt();
                        Database.allAccounts[index].creditBalance(amount);
                    }else if(temp==5){
                        System.out.println(Database.allAccounts[index].accountData());
                    }else if(temp==6){
                        break;
                    }
                }
            } else {
                int temp2 = 7;
                while (temp2!=3){
                    System.out.println("------------------------------------------------");
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL");//снятии счета, вы теряете еще 200тг со снятой суммы, так как у банкомата комиссия на другие карточки.
                    System.out.println("PRESS [2] TO VIEW BALANCE");
                    System.out.println("PRESS [3] TO EXIT");
                    System.out.println("------------------------------------------------");
                    temp2 = in.nextInt();
                    if(temp2==1){
                        System.out.print("Enter the amount: ");
                        int amount =in.nextInt();
                        if (Database.allAccounts[index].totalBalance()>=amount+200) {
                            Database.allAccounts[index].debetBalance(amount+200);
                        }else{
                            System.out.println("You don't have enough funds in your balance");
                        }
                    }else if(temp2==2){
                        System.out.println(Database.allAccounts[index].totalBalance());
                    }else if(temp2==3){
                        break;
                    }
                }
            }

        }else{
            System.out.println("incorrect PIN-code");
        }
    }
}
