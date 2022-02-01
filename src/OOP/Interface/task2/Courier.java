package OOP.Interface.task2;

public class Courier implements Worker
{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        warehouse.setBalance(warehouse.getBalance() + 1000);
        salary += 100;
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance() >= 1000000)
        {
            salary = salary * 2;
        }
    }
}
