package Job.newCom;

import java.util.ArrayList;

public class Account
{
    private int id;
    private String name;
    private double balance;
    private double AIRate;
    private ArrayList<Transaction> list;

    public void withdraw(double temp)
    {
        balance = balance - temp;
        Transaction transaction = new Transaction('W', temp,balance, "Withdraw");
        list.add(transaction);
    }

    public void deposit(double temp)
    {
        balance = balance + temp;
        Transaction transaction = new Transaction('D', temp,balance, "Deposit");
        list.add(transaction);
    }

    public Account(){}

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        list = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAIRate() {
        return AIRate;
    }

    public void setAIRate(double AIRate) {
        this.AIRate = AIRate;
    }

    public ArrayList<Transaction> getList() {
        return list;
    }

    public void setList(ArrayList<Transaction> list) {
        this.list = list;
    }
}
