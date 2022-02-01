package BitlabAcademy.OOP.Project.studentsSolution;
public class CityBankAccount implements BankAccount
{
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount(){}

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode)
    {
        this.name = name;
        this.surname = surname;
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
        balance = balance - credit;
    }
    @Override
    public void debetBalance(int debet)
    {
        balance = balance + debet;
    }
    @Override
    public String accountData()
    {
        return name + " " + surname + " " + balance + " " + accountNumber + " " + pinCode;
    }

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getBalance()
    {
        return balance;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
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
        return name + " " + surname + " " + balance + " " + accountNumber + " " + pinCode;
    }
}