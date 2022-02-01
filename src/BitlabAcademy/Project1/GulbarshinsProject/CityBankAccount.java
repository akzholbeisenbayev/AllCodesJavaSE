package BitlabAcademy.Project1.GulbarshinsProject;

public class CityBankAccount implements BankAccount {
    private  String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    CityBankAccount(){}
    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}
    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        pinCode= pinCode;
        System.out.println(pinCode);
    }

    @Override
    public int totalBalance() {
        return getBalance();
    }

    @Override
    public void creditBalance(int credit) {
        balance = balance-credit;
        System.out.println(balance);
    }

    @Override
    public void debetBalance(int debet) {
        balance = balance+debet;
        System.out.println(balance);
    }

    @Override
    public String accountData() {
        return getName() + " " + getSurname() + " " + getAccountNumber() + " "+ getBalance() + " " + getPinCode();
    }

    @Override
    public void setBalancee(int credit) {
        balance= balance-credit;
        System.out.println(balance);
    }
    public void getAccountData(){
        System.out.println(accountData());
    }
}
