package BitlabAcademy.OOP.Inheritance;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student = new Student("student1", "student1", 3.8, "IITU");
        Worker worker = new Worker("student2", "student2", 300000,"Software Developer");

        People[] people = {student, worker};

        for(int i=0; i<people.length; i++)
        {
            people[i].eat();
        }
    }
}
