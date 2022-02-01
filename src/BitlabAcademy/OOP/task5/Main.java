package BitlabAcademy.OOP.task5;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args) {
        Student student1 = new Student(1, "Nurai", "Meirasheva", 3.79);
        Student student2 = new Student(2, "Aida", "Ayiapbergenova", 3.85);
        Student student3 = new Student(3, "Aidana", "Sarsenova", 3.82);
        Student student4 = new Student(4, "Nurdana", "Karazhanova", 3.95);
        Student student5 = new Student(5, "Asmiga", "Erkinkyzy", 3.75);
        Student student6 = new Student(1, "Miras", "Turysbek", 3.65);
        Student student7 = new Student(2, "Eldos", "Turlybek", 3.58);
        Student student8 = new Student(3, "Tima", "Suleimen", 3.75);
        Student student9 = new Student(4, "Gulbarshyn", "Utegen", 4.0);
        Student student10 = new Student(5, "Symbat", "Abdyhan", 3.58);

        Student[] students = new Student[10];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;
        students[8] = student9;
        students[9] = student10;
        System.out.println(topStudent(students).getStudentData());

    }


    static Student topStudent(Student students[]){

        double max = Double.MIN_VALUE; //
        int index=0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getGpa()>max)
            {
                max=students[i].gpa;
                index = i;
            }
        }
        return students[index];
    }
}
