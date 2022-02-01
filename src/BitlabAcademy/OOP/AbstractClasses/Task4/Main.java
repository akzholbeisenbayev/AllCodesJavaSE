package BitlabAcademy.OOP.AbstractClasses.Task4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PRESS [1] TO ADD USER" + "\n" + "PRESS [2] TO LIST USERS" + "\n" + "PRESS [3] TO LIST USER BY INDEX" + "\n" + "PRESS [0] TO EXIT");
        int a = in.nextInt();
        Student student = new Student();
        Teacher teacher = new Teacher();
        ERPSystem erpSystem = new ERPSystem();
        switch (a) {
            case 1:
                System.out.println("PRESS [1] TO ADD STUDENT" + "\n" + "PRESS [2] TO ADD TEACHER");
                int b = in.nextInt();
                switch (b) {
                    case 1:
                        student = new Student();

                        System.out.println("Login:");
                        String login = in.next();
                        student.setLogin(login);
                        System.out.println("Password:");
                        String password = in.next();
                        student.setPassword(password);
                        System.out.println("Name:");
                        String name = in.next();
                        student.setName(name);
                        System.out.println("Surname:");
                        String surname = in.next();
                        student.setSurname(surname);
                        System.out.println("Group:");
                        String group = in.next();
                        student.setGroup(group);
                        System.out.println("GPA:");
                        double gpa = in.nextDouble();
                        student.setGpa(gpa);
                        break;
                    case 2:
                        teacher = new Teacher();
                        System.out.println("Login:");
                        String loginn = in.next();
                        teacher.setLogin(loginn);
                        System.out.println("Password:");
                        String passwordd = in.next();
                        teacher.setPassword(passwordd);
                        System.out.println("Nick Name:");
                        String nickName = in.next();
                        teacher.setNickName(nickName);
                        System.out.println("Status");
                        String status = in.next();
                        teacher.setStatus(status);
                        System.out.println("PRESS [1] TO ADD SUBJECT" + "\n" + "PRESS [0] TO FINISH ADDING SUBJECT");
                        int c = in.nextInt();
                        switch (c) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Subject:");
                                String Subject = in.next();
                                teacher.addSubject(Subject);
                        }
                }
            case 2:
                System.out.println("PRESS [1] TO LIST STUDENTS" + "\n" + "PRESS [2] TO LIST TEACHERS");
                int d = in.nextInt();
                switch (d) {
                    case 1: student.getUserData();
                    case 2: teacher.getUserData();
                }
            case 3:
                System.out.println("ENTER INDEX:");
                int f = in.nextInt();
                erpSystem.printUser(f);

            case 0:
                break;
        }
    }
}


//ERPSystem erpSystem;
//
//        Scanner in = new Scanner(System.in);
//
//        int choice=7;
//
//        while(choice !=0)
//        {
//            System.out.println("PRESS [1] TO ADD USER");
//            System.out.println("PRESS [2] TO LIST USERS");
//            System.out.println("PRESS [3] TO LIST USER BY INDEX");
//            System.out.println("PRESS [0] TO EXIT");
//
//            choice = in.nextInt();
//
//            if (choice == 1) {
//                System.out.println(" PRESS [1] TO ADD STUDENT");
//                System.out.println("PRESS [2] TO ADD TEACHER");
//                int choice2 = in.nextInt();
//               if(choice2==1)
//               {
//                   System.out.print("Login: ");
//                   String login = in.next();
//                   System.out.print("Password: ");
//                   String password = in.next();
//                   System.out.print("Name: ");
//                   String name = in.next();
//
//                   System.out.print("Surname: ");
//                   String surname = in.next();
//                   System.out.print("Group: ");
//                   String group = in.next();
//                   System.out.print("GPA: ");
//                   double gpa = in.nextDouble();
//               }
//                else if (choice2 == 2) {
//                   System.out.print("Login: ");
//                   String login = in.next();
//                   System.out.print("Password: ");
//                   String password = in.next();
//                   System.out.print("Nick Name: ");
//                   String nikname = in.next();
//
//                   int choice3 = 4;
//                   while(choice3!=0) {
//                       choice3 = in.nextInt();
//                       System.out.println("PRESS [1] TO ADD SUBJECT");
//                       System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
//                       if (choice3 == 1) {
//                           System.out.print("Subject: ");
//                           String subject = in.next();
//                       } else if (choice3 == 0) break;
//                   }
//
//                }
//            } else if (choice == 2) {
//
//            } else if (choice == 3) {
//
//            } else if (choice == 0) break;
//        }
