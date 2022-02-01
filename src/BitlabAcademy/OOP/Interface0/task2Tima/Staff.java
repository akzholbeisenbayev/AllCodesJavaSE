package BitlabAcademy.OOP.Interface0.task2Tima;

public class Staff implements Workers {
    int id;
    int salary;
    String name;
    String surname;

    public Staff() {
        this.id = -1;
        this.salary = -1;
        this.name = "";
        this.surname = "";

    }

    public Staff(int id,String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }


    public String getWorkerData(){
        return "ID:"+id+" NAME:"+ name + " "+surname;
    }
    public int getSalary(){
        return salary;
    }

}