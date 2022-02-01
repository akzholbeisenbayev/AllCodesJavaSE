package BitlabAcademy.OOP.Inheritance.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        ArrayList<User> users = new ArrayList<>();


        while (a!=0){
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            a = in.nextInt();
            if (a == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                int b = in.nextInt();
                if(b==1){
                    System.out.println("Insert name:");
                    Student s = new Student();
                    s.name = in.next();
                    System.out.println("Insert surname:");
                    s.surname = in.next();
                    System.out.println("Insert GPA:");
                    double gpa = in.nextDouble();
                    s.setGpa(gpa);
                    System.out.println("Insert Course:");
                    String course="";
                    course=in.next();
                    s.addCourses(course);
                    System.out.println("Insert Login:");
                    String login = in.next();
                    s.setLogin(login);
                    System.out.println("Insert password:");
                    String password = in.next();
                    s.setPassword(password);
                    users.add(s);
                }else if(b==2){
                    System.out.println("Insert name:");
                    Staff stf = new Staff();
                    stf.name = in.next();
                    System.out.println("Insert surname:");
                    stf.surname = in.next();
                    System.out.println("Insert Salary:");
                    double salary = in.nextDouble();
                    stf.setSalary(salary);
                    System.out.println("Insert Subject:");
                    String subject= "";
                    subject=in.next();
                    stf.addSubjects(subject);

                    System.out.println("Insert Login:");
                    String login = in.next();
                    stf.setLogin(login);
                    System.out.println("Insert password:");
                    String password = in.next();
                    stf.setPassword(password);
                    users.add(stf);
                }

            }else if(a==2){
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                int c = in.nextInt();
                if(c==1){
                    for (int i = 0; i < users.size(); i++) {
                        if(users.get(i) instanceof Student){
                            users.get(i).getData();
                        }
                    }
                }else if(c==2){
                    for (int i = 0; i < users.size(); i++) {
                        if(users.get(i) instanceof Staff){
                            users.get(i).getData();
                        }
                    }
                }

            }else{
                break;
            }

        }

    }
}
