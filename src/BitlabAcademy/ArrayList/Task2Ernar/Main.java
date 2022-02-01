package BitlabAcademy.ArrayList.Task2Ernar;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication("National Bank");
        BankApplication bankApplication1 = new BankApplication("Bank RBK");
        BankApplication bankApplication2 = new BankApplication("Kaspi Bank");

        Account account1 = new Account(1234, "Yernar", "Baidolla", 78000);
        Account account2 = new Account(1235, "Nurbolat", "Meshitbay", 9000.0);
        Account account3 = new Account(1236, "Messi", "Leo", 7810.5);
        Account account4 = new Account(1237, "Ronaldo", "Cristiano", 7553.555);
        Account account5 = new Account(1238, "Ter Stegen", "Mark", 43345.4);
        Account account6 = new Account(1239, "Andreas", "Iniesta", 13484.55);
        Account account7 = new Account(1240, "Frenkie", "De Jong", 78445.55);
        Account account8 = new Account(1241, "Kilian", "Mbappe", 459.5564);
        Account account9 = new Account(1242, "Ricardo", "Carvalio", 4552.0);

        bankApplication.addAccount(account1);
        bankApplication.addAccount(account2);
        bankApplication.addAccount(account3);

        bankApplication1.addAccount(account4);
        bankApplication1.addAccount(account5);
        bankApplication1.addAccount(account6);

        bankApplication2.addAccount(account7);
        bankApplication2.addAccount(account8);
        bankApplication2.addAccount(account9);

        ArrayList<BankApplication>allBanks = new ArrayList<>();
        allBanks.add(bankApplication);
        allBanks.add(bankApplication1);
        allBanks.add(bankApplication2);

        int index = 0;

        BankApplication temp;

        //1 2 3 4 5
        //2 1 3 4 5
        //2 3 4 5 1

        //3 4 5 2 1

        //1 2 3 4 5
        //2 1 3 4 5
        //2 3 4 5 1

        //3 4 5 2 1

        for (int i = 0; i < allBanks.size()-1; i++){
            for(int j = 0; j<allBanks.size()-i-1; j++){
                if(allBanks.get(j).getAverageBalance()<allBanks.get(j+1).getAverageBalance()){
                    temp = allBanks.get(j);
                    allBanks.set(j,allBanks.get(j+1));
                    allBanks.set(j+1,temp);
                }
            }
        }


        for(int i = 0;i<allBanks.size();i++){
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}
