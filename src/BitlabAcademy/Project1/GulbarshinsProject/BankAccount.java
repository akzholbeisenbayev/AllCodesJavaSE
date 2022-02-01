package BitlabAcademy.Project1.GulbarshinsProject;
public interface BankAccount {
    public String getAccountNumber();
    public String getPinCode();
    public void setPinCode(String pinCode);
    public int totalBalance();
    public void creditBalance(int credit);
    public void debetBalance(int debet);
    public String accountData();
    public void setBalancee(int credit);
    public void getAccountData();
}