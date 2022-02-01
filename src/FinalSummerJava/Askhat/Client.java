package FinalSummerJava.Askhat;

public class Client
{
    private String name;
    private int wallet;

    public Client(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}
