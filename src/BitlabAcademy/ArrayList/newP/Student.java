package BitlabAcademy.ArrayList.newP;

public class Student
{
    private String name;
    private String surname;

    public Student(){}

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
