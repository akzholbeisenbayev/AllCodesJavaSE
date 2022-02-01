package BitlabAcademy.ArrayList.Task2Ernar;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList <Account> accounts = new ArrayList();

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account a){
        accounts.add(a);
    }
    public void removeAccount(int i){
        accounts.remove(i);
    }
    public Account getMaxAccount(){
        double max = Double.MIN_VALUE;
        int index = 0;
        for(int p = 0;p<accounts.size();p++){
            if(accounts.get(p).getBalance()>max){
                max=accounts.get(p).getBalance();
                index=p;
            }
        }return accounts.get(index);
    }
    public double getAverageBalance(){
        double sum = 0;
        for(int i = 0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }return sum/accounts.size();
    }
    public double getTotalBalance(){
        double sum = 0;
        for(int i = 0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }return sum;
    }
    public int totalAccounts(){
        int sum = 0;
        sum = accounts.size();
        return sum;
    }
    public String getBankData(){
        return "Bank Name:"+getName()+"  Sum shet:"+totalAccounts()+"  Sum Balance:"+getTotalBalance()+"  Average Balance:"+getAverageBalance();
    }
}