package BitlabAcademy.OOP.Inheritance.Task5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        User u = new User();
        User u1 = new  User(1, "blat", "brat", "john", "snow");
        User u2 = new  User(1, "blat", "brat", "john", "snow");
        User u3 = new  User(1, "blat", "brat", "john", "snow");
        User u4 = new  User(1, "blat", "brat", "john", "snow");
        User u5 = new  User(1, "blat", "brat", "john", "snow");
        Staff s1 = new Staff(123, "krovnyi", "rovnyi", "vodnyi", "drovnyi", 123);
        Staff s2 = new Staff(123, "krovnyi", "rovnyi", "vodnyi", "drovnyi", 123);
        Staff s3 = new Staff(123, "krovnyi", "rovnyi", "vodnyi", "drovnyi", 123);
        Staff s4 = new Staff(123, "krovnyi", "rovnyi", "vodnyi", "drovnyi", 123);
        Staff s5 = new Staff(123, "krovnyi", "rovnyi", "vodnyi", "drovnyi", 123);
        Student st1 = new Student(999, "Genadyi", "GGG", "Gaben", "Saken", 123.56);
        Student st2 = new Student(999, "Genadyi", "GGG", "Gaben", "Saken", 123.56);
        Student st3 = new Student(999, "Genadyi", "GGG", "Gaben", "Saken", 123.56);
        Student st4 = new Student(999, "Genadyi", "GGG", "Gaben", "Saken", 123.56);
        Student st5 = new Student(999, "Genadyi", "GGG", "Gaben", "Saken", 123.56);

        User[] users = new User[]{u1,u2,u3,u4,u5,s1,s2,s3,s4,s5,st1,st2,st3,st4,st5};
        for(int i=0;i<users.length;i++){
            if(users[i] instanceof Student){
                ((Student) users[i]).addCourse("Math");
            }
            else if(users[i] instanceof Staff){
                ((Staff) users[i]).addSubject("Math");
            }
        }
        for(int i= 0;i<users.length;i++){
            if(users[i] instanceof Student){
                ((Student) users[i]).addCourse("Physics");
            }
            else if(users[i] instanceof Staff){
                ((Staff) users[i]).addSubject("Biology");
            }
        }
        for(int i=0;i<users.length;i++){
            if(users[i] instanceof Student){
                ((Student) users[i]).addCourse("PE");
            }
            else if(users[i] instanceof Staff){
                ((Staff) users[i]).addSubject("Finance");
            }
        }
        for(int i=0;i<users.length;i++){
            if(users[i] instanceof Student){
                System.out.println(users[i].getData());
                ((Student) users[i]).getCourses();
            }
            else if(users[i] instanceof Staff){
                System.out.println(users[i].getData());
                ((Staff) users[i]).getSubjects();
            }
        }
    }
}
//public class Main
//{
//    public static void main(String[] args) {
//
//        Staff staff1 = new Staff(1, "aks", "faf2", "Akzhol", "Beisenbayev", 1500000);
//        Staff staff2 = new Staff(2, "aks", "faf2", "Akzhol", "Beisenbayev", 1500000);
//        Staff staff3 = new Staff(3, "aks", "faf2", "Akzhol", "Beisenbayev", 1500000);
//        Staff staff4 = new Staff(4, "aks", "faf2", "Akzhol", "Beisenbayev", 1500000);
//        Staff staff5 = new Staff(5, "aks", "faf2", "Akzhol", "Beisenbayev", 1500000);
//
//
//        Student student1 = new Student(1, "aks", "faf2", "Akzhol", "Beisenbayev", 3.86);
//        Student student2 = new Student(2, "aks", "faf2", "Akzhol", "Beisenbayev", 3.86);
//        Student student3 = new Student(3, "aks", "faf2", "Akzhol", "Beisenbayev", 3.86);
//        Student student4 = new Student(4, "aks", "faf2", "Akzhol", "Beisenbayev", 3.86);
//        Student student5 = new Student(5, "aks", "faf2", "Akzhol", "Beisenbayev", 3.86);
//
//        staff1.addSubject("math");
//        staff1.addSubject("geometry");
//        staff2.addSubject("math");
//        staff3.addSubject("math");
//        staff4.addSubject("math");
//        staff5.addSubject("math");
//
//        student1.addCourse("Java SE");
//        student1.addCourse("Java SE");
//        student1.addCourse("Java SE");
//        student2.addCourse("Java SE");
//        student3.addCourse("Java SE");
//        student4.addCourse("Java SE");
//        student5.addCourse("Java SE");
//
//        User[] users = {staff1, staff2, staff3, staff4, staff5, student1, student2,student3,student4,student5};
//
//        for(User temp:users)
//        {
//            temp.getData();
//        }
//    }
//}
