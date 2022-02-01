package BitlabAcademy.OOP.Objecs.task5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student s1 = new Student(1, "Danya", "Bul", 5);
        Student s2 = new Student(2, "Danya2", "Bul2", 4);
        Student s3 = new Student(3, "Danya3", "Bul3", 3);
        Student s4 = new Student(4, "Danya4", "Bul4", 2);
        Student s5 = new Student(5, "Danya5", "Bul5", 1);
        Student s6 = new Student(5, "Danya5", "Bul5", 1);
        Student s7 = new Student(5, "Danya5", "Bul5", 1);
        Student s8 = new Student(5, "Danya5", "Bul5", 1);
        Student s9 = new Student(5, "Danya5", "Bul5", 1);
        Student s10 = new Student(5, "Danya5", "Bul5", 1);
        Student[] mas = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

        System.out.println(topStudent(mas).getStudentData());

    }
    public static Student topStudent(Student[] mas){
        double max = Integer.MIN_VALUE;
        int q = 0;
        for(int i = 0; i < 10; i++){
            if(mas[i].gpa > max) {
                max = mas[i].gpa;
                q = i;
            }
        }
        return mas[q];
    }
}
