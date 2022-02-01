package BitlabAcademy.OOP.Interface0.Task2;

public class HRManagers implements Worker{

    private int id;

    HRManagers(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    private  String fullName;
    private int salary;

    @Override
    public String getWorkerData() {
        return getId() + ", " + getFullName() + ", " + getSalary();
    }

    @Override
    public int getSalary() {
        return salary;
    }
}