package BitlabAcademy.OOP.Interface0.task2Tima;

public class Programmers implements Workers{
    int id;
    String nickname;
    int salary;
    int bonusSalary;
    double KPIValue;

    public Programmers(){
        this.id = -1;
        this.nickname = "";
        this.salary = -1;
        this.bonusSalary = -1;
        this.KPIValue = -1.0;

    }

    public Programmers(int id,String nickname,int salary, int bonusSalary, double KPIValue){
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;

    }

    public String getWorkerData(){
        return "ID:"+id+" NAME:"+ nickname;
    }
    public int getSalary(){
        return salary + (int)KPIValue*bonusSalary;
    }

}
