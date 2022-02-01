package JobDiscord.JDBC;

import javax.xml.crypto.Data;

public abstract class Transactions
{
    private int id;
    private Data date;
    private String type; //deposit of money / withdrawal of money / money transfer
    private double amountOfMoney;

    public Transactions(int id, Data date, String type, double amountOfMoney) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
