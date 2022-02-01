package BitlabAcademy.ArrayList.task2Danik;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList();

    public BankApplication() {
    }

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        double max = Integer.MIN_VALUE;
        int q = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalance() > max) {
                max = accounts.get(i).getBalance();
                q = i;
            }
        }
        return accounts.get(q);
    }

    public double getAverageBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum += accounts.get(i).getBalance();
        }
        return sum / accounts.size();
    }

    public double getTotalBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum += accounts.get(i).getBalance();
        }
        return sum;
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public String getBnkData() {
        return name + " " + accounts.size() + " " + getTotalBalance() + " " + getAverageBalance();
    }
}