package BitlabAcademy.Project1.DaniyarsProject;

public class NationalBankAccount implements BankAccount
{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount() {}
    public NationalBankAccount(String fullName,String accountNumber,  String pinCode, int balance) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
    public void setBalance(int balance) {this.balance = balance;}
    public int getBalance() {return balance;}

    public String getAccountNumber(){return accountNumber;}
    public String getPinCode(){return pinCode;}
    public void setPinCode(String pinCode){this.pinCode = pinCode;}
    public int totalBalance(){return getBalance();}
    public void creditBalance(int credit)
    {balance = balance - credit - 200;System.out.println(balance);}
    public void debetBalance(int debet)
    {balance = balance + debet; System.out.println(balance);}
    public String accountData(){return getFullName();}
}
