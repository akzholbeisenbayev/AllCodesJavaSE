package BitlabAcademy.Project1.ErnarsProject;

public class NationalBankAccount implements BankAccount{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount(String fullName,int balance,String accountNumber,String pinCode){
        this.fullName=fullName;
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.pinCode=pinCode;
    }

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
        this.pinCode=pinCode;
    }

    @Override
    public int totalBalance() {
        return getBalance();
    }

    @Override
    public void creditBalance(int credit) {
        balance=balance-credit;
        System.out.println("Your balance:"+balance);
    }

    @Override
    public void debetBalance(int debet) {
        balance=balance+debet;
        System.out.println("Your balance:"+balance);
    }

    @Override
    public String accountData() {
        return "Name:"+getFullName();
    }

    public String getFullName() {
        return fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
