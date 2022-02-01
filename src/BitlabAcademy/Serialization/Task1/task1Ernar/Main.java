package BitlabAcademy.Serialization.Task1.task1Ernar;

import Codeforces.D710iv3.A;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student>students = new ArrayList<>();
        ArrayList<Subject>subjects = new ArrayList<>();
        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT"+"\n"+"PRESS [2] TO LIST STUDENTS"+"\n"+"PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("Insert name:");
                String name =in.next();
                System.out.println("Insert surname:");
                String surname  = in.next();
                Student student = new Student(name, surname);
               // students.add(new Student(name,surname));
                while (true){
                    System.out.println("PRESS [1] TO ADD SUBJECT"+"\n"+"PRESS [0] TO GO TO MAIN MENU");
                    int a = in.nextInt();

                    if(a==1){
                            System.out.println("Insert name:");
                            String Name = in.next();
                            System.out.println("Insert Credits:");
                            int credits = in.nextInt();
                        Subject subject = new Subject(Name, credits);

                        ArrayList<Student> students2 = getObjects(students);
                        if(students2!=null) {
                            if (!students.equals(students2)) {
                                student.addSubjects(subject);
                                students.add(student);
                                saveObjects(students);
                            }
                        }

                        //    subjects.add(subject);
                      //  for(int i =0 ;i<students.size();i++){
                         //   students.get(i).addSubjects(subject);
                      //  }

                    }else if(a==0){
                        ArrayList<Student> students2 = getObjects(students);
                        if(students.equals(students2))
                        {
                            break;
                        }
                        else {
                            students.add(student);
                            saveObjects(students);
                        }
                    }
                }
            }else if(choice==2){
                students=new ArrayList<>();
                for(Student s: students){
                    System.out.println(s.getName()+", "+s.getSurname()+" - "+s.getSubjects());
                }
            }else if(choice==0){
                System.exit(0);
            }
        }
    }

    public static void saveObjects(ArrayList<Student> students){
        try {
            ObjectOutputStream outputStream = new
                    ObjectOutputStream(new FileOutputStream("memory.dat"));
            outputStream.writeObject(students);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<Student> getObjects(ArrayList<Student> students)
    {
        try{
            ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream("memory.dat"));
            students = (ArrayList<Student>) inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }
}
