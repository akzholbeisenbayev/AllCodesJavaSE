package BitlabAcademy.ArrayList.Task2;

import java.util.ArrayList;

public class BankApplication {

    private String name;

    private ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(String name) {
        this.name = name;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i){
        accounts.remove(i);
    }

    public Account getMaxAccount(){
        //1 2 3 4 5

        double max = Integer.MIN_VALUE;
        int index = 0;
        for(int i =0; i<accounts.size(); i++){
            //a[i]
            if(accounts.get(i).getBalance()>max){
                max = accounts.get(i).getBalance();
                index=i;
            }
        }return accounts.get(index);
    }

    public double getAverageBalance(){
        int sum=0;
        int count=0;
        double b= 0;
        for(int i=0; i<accounts.size(); i++){
            sum+= accounts.get(i).getBalance();
            count++;
            b = sum/count;

        }return b;
    }

    public double doublegetTotalBalance(){
        double sum = 0;
        for(int i=0; i<accounts.size(); i++) {
            sum+= accounts.get(i).getBalance();
        }return sum;

    }

    public int totalAccounts(){ return  accounts.size(); }



    public String getBankData(){
        return "Name : "+name +  " Total Accounts "+ totalAccounts()+ "  Total Balance "+doublegetTotalBalance()+"   AVG Balance "+getAverageBalance();
    }

}
