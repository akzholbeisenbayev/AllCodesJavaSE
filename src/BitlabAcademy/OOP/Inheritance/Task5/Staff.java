package BitlabAcademy.OOP.Inheritance.Task5;

import java.util.Arrays;
public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary){
        super(id, login, password,name, surname);
        this.salary=salary;
    }
    public Staff(){
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject=indexOfSubject+1;

    }
    public void getSubjects() {
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }

    @Override
    public  String getData(){
        return id+" "+login+" "+password+" "+name+" "+surname+" "+salary;
    }
}
//public class Staff extends User
//{
//    private double salary;
//    private String subjects[] = new String[100];
//    private int indexOfSubject = 0;
//
//
//    public Staff(int id, String login, String password, String name, String surname, double salary) {
//        super(id, login, password, name, surname);
//        this.salary = salary;
//    }
//
//    public void addSubject(String subject)
//    {
//        subjects[indexOfSubject] = subject; //0 = math
//                                    //1 = geometry
//        indexOfSubject++;
//    }
//
//    @Override
//    public void getData() {
//        super.getData();
//        System.out.print(getSalary() + ", ");
//        getSubjects();
//        System.out.println(getIndexOfSubject());
//        System.out.println("________________________________________________________________________________________");
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void getSubjects() {
//        for(int i=0; i<indexOfSubject; i++)
//        {
//            System.out.print(subjects[i] + ", ");
//        }
//    }
//
//    public void setSubjects(String[] subjects) {
//        this.subjects = subjects;
//    }
//
//    public int getIndexOfSubject() {
//        return indexOfSubject;
//    }
//
//    public void setIndexOfSubject(int indexOfSubject) {
//        this.indexOfSubject = indexOfSubject;
//    }
//}
