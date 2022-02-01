package BitlabAcademy.ArrayList.task2Tima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public BankApplication(){
        this.name = "";
    }

    public BankApplication(String name){
        this.name = name;
    }

    public void addAccount(Account a){
        accounts.add(a);
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                if (o1.balance>o2.balance){
                    return 1;
                }
                if(o1.balance<o2.balance){
                    return -1;
                }
                return 0;
            }
        });
    }

    public void removeAccount(int i){
        accounts.remove(i);
    }

    public Account getMaxAccount(){

        return accounts.get(accounts.size()-1);
    }

    public double getAverageBalance(){
        double sum = 0;
        for(int i=0;i<accounts.size();i++){
            sum = sum + accounts.get(i).balance;
        }
        return sum/accounts.size();
    }

    public double getTotalBalance(){
        double sum = 0;
        for(int i=0;i<accounts.size();i++){
            sum = sum + accounts.get(i).balance;
        }
        return sum;
    }

    public int totalAccounts(){
        return accounts.size();
    }

    public String getBankData(){
        return name+" "+totalAccounts()+" "+getTotalBalance()+" "+getAverageBalance();
    }
}