package BitlabAcademy.OOP.Inheritance.Task5;

import java.util.Arrays;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student(int id, String login, String password, String name, String surname,double gpa){
        this.gpa=gpa;
    }
    public Student(){
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    public void addCourse(String course){
        courses[indexOfCourses]=course;
        indexOfCourses = indexOfCourses +1;
    }
    public void getCourses(){
        for(int i = 0;i<indexOfCourses;i++){
            System.out.println(courses[i]);
        }
    }
    @Override
    public String getData(){
        return id+" "+login+" "+password+" "+name+" "+surname+" "+gpa;
    }
}

//public class Student extends User
//{
//
//    private double gpa;
//    private String courses[] = new String[100];
//    private int indexOfCourses = 0;
//
//
//    public Student(int id, String login, String password, String name, String surname, double gpa) {
//        super(id, login, password, name, surname);
//        this.gpa = gpa;
//    }
//
//    public int getIndex() {
//        return indexOfCourses;
//    }
//
//    public void addCourse(String course)
//    {
//        courses[indexOfCourses] = course;
//        indexOfCourses++;
//    }
//
//    @Override
//    public void getData() {
//        super.getData();
//        System.out.print(getGpa() + ", ");
//        getCourses();
//        System.out.println(getIndexOfCourses());
//        System.out.println("________________________________________________________________________________________");
//
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    public void getCourses() {
//        for(int i=0; i<indexOfCourses; i++)
//        {
//            System.out.print(courses[i] + ", ");
//        }
//    }
//
//    public void setCourses(String[] courses) {
//        this.courses = courses;
//    }
//
//    public int getIndexOfCourses() {
//        return indexOfCourses;
//    }
//
//    public void setIndexOfCourses(int indexOfCourses) {
//        this.indexOfCourses = indexOfCourses;
//    }
//
//
//
//}
