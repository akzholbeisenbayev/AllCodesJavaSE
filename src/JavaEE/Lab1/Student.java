package JavaEE.Lab1;

public class Student
{
    private String firstName;
    private String secondName;
    private int id;
    private ScholarshipCard card;

    public Student(){}

    public Student(String firstName)
    {
        this.firstName =  firstName;
    }

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student(String firstName, String secondName, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
    }

    public Student(String firstName, String secondName, int id, ScholarshipCard card) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        this.card = card;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", id=" + id +
                ", card=" + card +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ScholarshipCard getCard() {
        return card;
    }

    public void setCard(ScholarshipCard card) {
        this.card = card;
    }
}
