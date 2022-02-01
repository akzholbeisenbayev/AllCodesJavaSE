package BitlabAcademy.OOP.Project.studentsSolution;

public class NationalBankAccount implements BankAccount
{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount(){}

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode)
    {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    @Override
    public String getAccountNumber()
    {
        return accountNumber;
    }
    @Override
    public String getPinCode()
    {
        return pinCode;
    }
    @Override
    public void setPinCode(String pinCode)
    {
        this.pinCode = pinCode;
    }
    @Override
    public int totalBalance()
    {
        return balance;
    }
    @Override
    public void creditBalance(int credit)
    {
        if(credit > balance)
        {
            System.out.println("YOU DO NOT HAVE ENOUGH MONEY");
        }
        else
        {balance = balance - credit;}
    }
    @Override
    public void debetBalance(int debet)
    {
        balance = balance + debet;
    }
    @Override
    public String accountData()
    {
        return fullName + " " + balance + " " + accountNumber + " " + pinCode;
    }

    public String getFullName()
    {
        return fullName;
    }
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getUserData()
    {
        return fullName + " " + balance + " " + accountNumber + " " + pinCode;
    }

}