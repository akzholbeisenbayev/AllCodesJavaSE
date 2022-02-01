package BitlabAcademy.ArrayList.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BankApplication BA1 = new BankApplication("BA1");
        BankApplication BA2 = new BankApplication("BA2");
        BankApplication BA3 = new BankApplication("BA3");


        Account a1 = new Account(1, "A1", "AA1", 1000);
        Account a2 = new Account(2, "A2", "AA2", 2000);
        Account a3 = new Account(3, "A3", "AA3", 3000);

        Account a4 = new Account(4, "A4", "AA4", 4000);
        Account a5 = new Account(5, "A5", "AA5", 5000);
        Account a6 = new Account(6, "A6", "AA6", 6000);

        Account a7 = new Account(7, "A7", "AA7", 7000);
        Account a8 = new Account(1, "A8", "AA8", 8000);
        Account a9 = new Account(1, "A9", "AA9", 9000);

        BA1.addAccount(a1);
        BA1.addAccount(a2);
        BA1.addAccount(a3);

        BA2.addAccount(a4);
        BA2.addAccount(a5);
        BA2.addAccount(a6);

        BA3.addAccount(a7);
        BA3.addAccount(a8);
        BA3.addAccount(a9);


        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(BA1);
        allBanks.add(BA2);
        allBanks.add(BA3);

        for (int i = 0; i < allBanks.size(); i++) {
            System.out.println(allBanks.get(i).getBankData());
        }


        double ba1avg = BA1.getAverageBalance();
        double ba2avg = BA2.getAverageBalance();
        double ba3avg = BA3.getAverageBalance();

        BankApplication temp;


        //9 8 7 6 5 4 3 2 1

        // temp =  1
        //(allBanks.get(j).getAverageBalance()  = 2
        //allBanks.get(j+1).getAverageBalance() = 1

        System.out.println("Sortirovka po Ubivaniu");
        for (int i = 0; i < allBanks.size()-1; i++) { //i=2
            for (int j = 0; j<allBanks.size()-1-i; j++) { //j=0
                if (allBanks.get(j).getAverageBalance()<allBanks.get(j+1).getAverageBalance()) {
                    temp = allBanks.get(j);
                    allBanks.set(j, allBanks.get(j+1));
                    allBanks.set(j+1, temp);
                }
            }
        }

        for (int i = 0; i < allBanks.size(); i++) {
            System.out.println(allBanks.get(i).getBankData());
        }


    }

}

