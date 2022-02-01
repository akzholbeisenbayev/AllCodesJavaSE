package BitlabAcademy.ArrayList.task2Danik;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BankApplication b = new BankApplication("rak");
        BankApplication b1 = new BankApplication("fafa");
        BankApplication b2 = new BankApplication("dada");

        b.addAccount(new Account(1,"a","b", 100));
        b.addAccount(new Account(2,"a1","b2",200));
        b.addAccount(new Account(3,"a2","b3",3000));

        b1.addAccount(new Account(4,"a3","b4",400));
        b1.addAccount(new Account(5,"a4","b5",500));
        b1.addAccount(new Account(6,"a5","b6",600));

        b2.addAccount(new Account(7,"a6","b7",700));
        b2.addAccount(new Account(8,"a7","b8",800));
        b2.addAccount(new Account(9,"a8","b9",900));

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(b); allBanks.add(b1); allBanks.add(b2);

        for(int i = 0; i < allBanks.size(); i++){
            for(int j = 0; j < allBanks.size() - 1;j++){
                BankApplication d = allBanks.get(j);
                BankApplication q = allBanks.get(j+1);
                if(d.getAverageBalance() < q.getAverageBalance()){
                    allBanks.set(j,q);
                    allBanks.set(j+1,d);
                }
            }
        }

        for(BankApplication s: allBanks){
            System.out.println(s.getBnkData());
        }
    }
}