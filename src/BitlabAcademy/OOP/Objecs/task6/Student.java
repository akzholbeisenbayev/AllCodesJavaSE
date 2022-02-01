package BitlabAcademy.OOP.Objecs.task6;

public class Student
{
    String name;
    String surname;
    double gpa;

    public Student(){}
    public Student(String name, String surname, double gpa)
    {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getData()
    {
        return name+" "+surname+" "+gpa;
    }
}
