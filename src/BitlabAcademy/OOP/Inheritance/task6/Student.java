package BitlabAcademy.OOP.Inheritance.task6;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;


    Student(){}
    Student(String login, String password, String name, String surname,  double gpa){
        super(login, password, name, surname);
        this.gpa = gpa;
    }
    public void setGpa(double gpa){this.gpa=gpa;}
    public double getGpa(){return gpa;}

    public int getIndexOfCourses(){return indexOfCourses;}

    public void addCourses(String course){
        this.courses[indexOfCourses] = course;
        indexOfCourses++;
    }
    public String getCourses(){
        String  s = "";
        for(int i=0; i<indexOfCourses;i++){
            s += courses[i]+"; ";
        }
        return s;
    }
    @Override
    public void getData(){
        super.getData();
        System.out.println(" "+getSurname()+" "+getGpa()+" "+getCourses());
    }

}
