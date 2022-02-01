package BitlabAcademy.OOP.Task6.task62;

public class Students {
    int id;
    String name;
    String surname;
    double gpa;


    public Students(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentsData(){
        return id +" " + name +" "+ surname +" "+ gpa;
    }


}
