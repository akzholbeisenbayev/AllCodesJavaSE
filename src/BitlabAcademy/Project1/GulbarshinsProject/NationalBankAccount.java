package BitlabAcademy.Project1.GulbarshinsProject;

public class NationalBankAccount implements BankAccount{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    NationalBankAccount(){}

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
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
        return getFullName() +" " + getBalance() + " " + getAccountNumber() + " " + getPinCode();
    }

    @Override
    public void setBalancee(int credit) {
        balance= balance-credit-200;
        System.out.println(balance);
    }
    public void getAccountData(){
        System.out.println(accountData());
    }

}