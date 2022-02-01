package JavaEE.Lab1;

import java.math.BigDecimal;

public class ScholarshipCard
{
    private String cardId;
    private BigDecimal balance;

    private int temp = 0;

    public ScholarshipCard(String cardId, BigDecimal balance)
    {
        this.cardId = cardId;
        this.balance = balance;
    }

    public void moneyRefill(double amount)
    {
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void moneyWithdrawal(double amount)
    {
        temp = 0;
        balance = balance.subtract(BigDecimal.valueOf(amount));
        temp++;
    }


    private void commissionMoney()
    {
        if(temp>0)
            balance = balance.subtract(balance.multiply(BigDecimal.valueOf(0.05)));
    }

    private void refillCardBalance()
    {
        if(temp>0)
            balance = balance.subtract(balance.multiply(BigDecimal.valueOf(0.05)));
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
