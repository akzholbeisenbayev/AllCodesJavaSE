package BitlabAcademy.ArrayList.task2Tima;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankApplication h = new BankApplication("Khalyk Bank");

        h.addAccount(new Account(1,"Killa", "Nemirov",1000));
        h.addAccount(new Account(2,"Joseph", "Stalin",2000));
        h.addAccount(new Account(3,"Killa", "Nemirov2",3000));
        h.addAccount(new Account(4,"Killa", "Nemiro3",4000));
        h.addAccount(new Account(5,"Killa", "Nemiro4",5000));
        h.addAccount(new Account(6,"Killa", "Nemirov5",6000));
        h.addAccount(new Account(7,"Killa", "Nemirov6",7000));
        h.addAccount(new Account(8,"Killa", "Nemirov7",8000));
        h.addAccount(new Account(9,"Killa", "Nemirov8",9000));
        h.addAccount(new Account(10,"Killa", "Nemirov9",10000));

        BankApplication f = new BankApplication("Forte Bank");

        f.addAccount(new Account(1,"Killa", "Nemirov",10000));
        f.addAccount(new Account(2,"Joseph", "Stalin",20000));
        f.addAccount(new Account(3,"Killa", "Nemirov2",30000));
        f.addAccount(new Account(4,"Killa", "Nemiro3",40000));
        f.addAccount(new Account(5,"Killa", "Nemiro4",50000));
        f.addAccount(new Account(6,"Killa", "Nemirov5",60000));
        f.addAccount(new Account(7,"Killa", "Nemirov6",70000));
        f.addAccount(new Account(8,"Killa", "Nemirov7",80000));
        f.addAccount(new Account(9,"Killa", "Nemirov8",90000));
        f.addAccount(new Account(10,"Killa", "Nemirov9",100000));

        BankApplication k = new BankApplication("Kaspi Bank");

        k.addAccount(new Account(1,"Killa", "Nemirov",100000));
        k.addAccount(new Account(2,"Joseph", "Stalin",200000));
        k.addAccount(new Account(3,"Killa", "Nemirov2",300000));
        k.addAccount(new Account(4,"Killa", "Nemiro3",400000));
        k.addAccount(new Account(5,"Killa", "Nemiro4",500000));
        k.addAccount(new Account(6,"Killa", "Nemirov5",600000));
        k.addAccount(new Account(7,"Killa", "Nemirov6",700000));
        k.addAccount(new Account(8,"Killa", "Nemirov7",800000));
        k.addAccount(new Account(9,"Killa", "Nemirov8",900000));
        k.addAccount(new Account(10,"Killa", "Nemirov9",1000000));

        ArrayList<BankApplication> allBanks = new ArrayList<BankApplication>();

        allBanks.add(h);
        allBanks.add(f);
        allBanks.add(k);

        Collections.sort(allBanks, new Comparator<BankApplication>() {
            @Override
            public int compare(BankApplication o1, BankApplication o2) {
                if (o1.getAverageBalance()>o2.getAverageBalance()){
                    return -1;
                }
                if(o1.getAverageBalance()<o2.getAverageBalance()){
                    return 1;
                }
                return 0;
            }
        });

        for(int i=0;i<allBanks.size();i++){
            System.out.println(allBanks.get(i).getBankData());
        }

        System.out.println(k.getMaxAccount());




    }
}