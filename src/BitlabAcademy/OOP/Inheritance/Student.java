package BitlabAcademy.OOP.Inheritance;

public class Student extends People
{
    double gpa;
    String university;

    public Student(String name, String surname, double gpa, String university) {
        super(name, surname);
        this.gpa = gpa;
        this.university = university;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(gpa);
        System.out.println(university);
    }
}
