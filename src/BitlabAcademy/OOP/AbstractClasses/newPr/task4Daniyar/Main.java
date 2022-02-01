package BitlabAcademy.OOP.AbstractClasses.newPr.task4Daniyar;

import java.util.ArrayList;
import  java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        ERPSystem erp = new ERPSystem();
        ERPSystem erp1 = new ERPSystem();

        do{
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");
            int a = in.nextInt();
            if(a == 1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");
                int c = in.nextInt();
                if(c == 1){
                    Student st1 = new Student();
                    System.out.print("Login: ");
                    String login = in.next();
                    st1.setLogin(login);

                    System.out.print("Password: ");
                    String password = in.next();
                    st1.setPassword(password);

                    System.out.print("Name: ");
                    String name = in.next();
                    st1.setName(name);

                    System.out.print("Surname: ");
                    String surname = in.next();
                    st1.setSurname(surname);

                    System.out.print("Group: ");
                    String group = in.next();
                    st1.setGroup(group);

                    System.out.print("GPA: ");
                    int gpa = in.nextInt();
                    st1.setGpa(gpa);

                    erp.addUser(st1);
                }
                else if(c == 2){
                    Teacher t1 = new Teacher();
                    System.out.print("Login: ");
                    String login = in.next();
                    t1.setLogin(login);

                    System.out.print("Password: ");
                    String password = in.next();
                    t1.setPassword(password);

                    System.out.print("Nick Name: ");
                    String name = in.next();
                    t1.setNickName(name);

                    System.out.print("Status: ");
                    String status = in.next();
                    t1.setStatus(name);

                    erp1.addUser(t1);

                    System.out.println("PRESS [1] TO ADD SUBJECT");
                    System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                    int cc = in.nextInt();
                    if(cc == 1){
                        System.out.print("Subject: ");
                        String subject = in.next();
                        t1.addSubject(subject);
                    }
                    else if (cc == 0){
                        continue;
                    }
                }
            }
            else if (a == 2){
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");
                int b = in.nextInt();
                if(b == 1){
                    erp.printAllUsers();
                }
                else if (b == 2){
                    erp1.printAllUsers();
                }
            }
            else if (a == 3){
                System.out.print("ENTER INDEX: ");
                int index = in.nextInt();
                erp.printUser(index);
            }
            else if (a == 0){
                return;
            }
        }while(1 != 0);
    }
}