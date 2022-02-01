package BitlabAcademy.OOP.Task6;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu = "PRESS [1] TO ADD STUDENT\n" + "PRESS [2] TO LIST STUDENT\n" + "PRESS [0] TO EXIT";
        System.out.println(menu);
        int number = in.nextInt();
        Student student1 = new Student("Asan", "Asanov", 3.1);
        Student student2 = new Student("Usen", "Usenov", 3.2);
        Student student3 = new Student("Oljas", "Oljasov", 3.4);
        Student student4 = new Student("Olya", "Olyavna", 3.5);
        Student student5 = new Student("Rus", "Rusov", 3.6);

        Student[] students = new Student[6];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        if(number==2) {
            for (int i = 0; i < 5; i++) {
                System.out.println(students[i].getStudentData());
            }System.out.println("\n" + "\n"+ "PRESS [0] TO EXIT");number = in.nextInt();
            System.out.println(menu);
            number = in.nextInt();
        }

        else if (number == 1) {
            student1 = new Student("Asan", "Asanov", 3.1);
            student2 = new Student("Usen", "Usenov", 3.2);
            student3 = new Student("Oljas", "Oljasov", 3.4);
            student4 = new Student("Olya", "Olyavna", 3.5);
            student5 = new Student("Rus", "Rusov", 3.6);

            students = new Student[6];
            students[0] = student1;
            students[1] = student2;
            students[2] = student3;
            students[3] = student4;
            students[4] = student5;

            System.out.println("Insert name? ");
            String name = in.next();
            System.out.println("Insert surname?");
            String surname = in.next();
            System.out.println("Insert GPA?");
            int gpa = in.nextInt();
            Student student6 = new Student(name, surname, gpa);
            students[5] = student6;

            System.out.println(menu);
            number = in.nextInt();

            if (number == 2) {
                for (int i = 0; i < 6; i++) {
                    System.out.println(students[i].getStudentData());
                }
            }
        }
    }
}