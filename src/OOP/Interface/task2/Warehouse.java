package OOP.Interface.task2;

public class Warehouse
{
    private int countOrder;
    private long balance;

    public Warehouse(){}

    public Warehouse(int countOrder, long balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
