package BitlabAcademy.Project1.DaniyarsProject;

public class CityBankAccount implements BankAccount
{
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;
    public CityBankAccount() {}
    public CityBankAccount(String name, String surname,  String accountNumber, String pinCode, int balance)
    {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setBalance(int balance) {this.balance = balance;}
    public int getBalance() {return balance;}
    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}

    public String getAccountNumber(){return accountNumber;}
    public String getPinCode(){return pinCode;}
    public void setPinCode(String pinCode){this.pinCode = pinCode;}
    public int totalBalance(){return getBalance();}
    public void creditBalance(int credit)
    {balance = balance - credit - 200;System.out.println(balance);}
    public void debetBalance(int debet)
    {balance = balance + debet; System.out.println(balance);}
    public String accountData(){return getName() + " " + getSurname();}
}
