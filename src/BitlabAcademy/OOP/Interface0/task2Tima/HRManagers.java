package BitlabAcademy.OOP.Interface0.task2Tima;

public class HRManagers implements Workers{
    int id;
    String fullName;
    int salary;


    public HRManagers(){
        this.id = -1;
        this.fullName = "";
        this.salary = -1;
    }

    public HRManagers(int id,String fullName,int salary){
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getWorkerData(){
        return "ID:"+id+" NAME:"+ fullName;
    }
    public int getSalary(){
        return salary;
    }

}
