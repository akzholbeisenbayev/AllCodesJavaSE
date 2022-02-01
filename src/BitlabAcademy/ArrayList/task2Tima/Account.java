package BitlabAcademy.ArrayList.task2Tima;

public class Account {
    int id;
    String name;
    String surname;
    double balance;

    public Account(){
        this.id = -1;
        this.name = "";
        this.surname = "";
        this.balance = -1.0;
    }

    public Account(int id, String name, String surname, double balance){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public String toString(){
        return id+" "+name+" "+surname+" "+balance;
    }

}