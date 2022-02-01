package BitlabAcademy.OOP.Project.rightSolution;

public class NationalBankAccount implements BankAccount {
    private String fullName;
    private int balance;
    private String accountNumber;
    private  String pinCode;

    NationalBankAccount(){}
    NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode){
        this.fullName=fullName;
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.pinCode=pinCode;
    }
    public void setFullName(String fullName){this.fullName=fullName;}
    public String getFullName(){return fullName;}

    public void setBalance(int balance){this.balance=balance;}
    public void setAccountNumber(String accountNumber){this.accountNumber=accountNumber;}

    @Override
    public String getAccountNumber(){
        return accountNumber;
    }
    @Override
    public String getPinCode(){
        return pinCode;
    }
    @Override
    public void setPinCode(String pinCode){this.pinCode=pinCode;}

    @Override
    public int totalBalance(){
        return balance;
    }
    @Override
    public void creditBalance(int credit){
        balance=balance+credit;
    }
    @Override
    public void debetBalance(int debit){
        balance=balance-debit;
    }

    @Override
    public String accountData() {
        return "Full Name: "+getFullName()+"; Total balance:"+totalBalance()+"; Account Number:"+getAccountNumber()+
                "; "+getPinCode()+";";
    }
}