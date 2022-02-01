package BitlabAcademy.Serialization.Task1.task1Daniyar;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student>students = new ArrayList<>();
        ArrayList<Subject>subjects = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println(" PRESS [1] TO ADD STUDENT");
            System.out.println(" PRESS [2] TO LIST STUDENTS");
            System.out.println(" PRESS [0] TO EXIT");
            String choise = in.next();

            if(choise.equals("1"))
            {
                System.out.println("Name: ");
                String name = in.next();
                System.out.println("Surname: ");
                String surname = in.next();

                Student st = new Student (name, surname);

                while(true) {
                    System.out.println("PRESS [1] TO ADD SUBJECT: ");
                    System.out.println("PRESS [0] TO GO TO MAIN MENU: ");
                    int choise1 = 3;
                    choise1 = in.nextInt();

                    if (choise1 == 1) {
                        for(int i =0 ;i<students.size();i++) {
                            System.out.println("name: ");
                            String name1 = in.next();
                            System.out.println("credits: ");
                            int credits = in.nextInt();

                            Subject pl = new Subject(name1, credits);
                            subjects.add(pl);
                            students.get(i).setSubjects(subjects);

                        }
                        saveStudents(students);
                    } else if (choise1 == 0) {
                        break;
                    }
                }
            } else if(choise.equals("2"))
            {
                students = new ArrayList<>();
                students = getStudentList();
                for(int i=0; i<students.size(); i++)
                    students.get(i).getData();

                for(Student s: students)
                    s.getData();
            }
            else if(choise.equals("0"))
            {
                System.exit(0);
            }
            else
                System.out.println("KAte san!!!");
        }
    }
    public static void saveStudents(ArrayList<Student> students)
    {
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
            outStream.writeObject(students);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveSubjects(ArrayList<Subject> subjects)
    {
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
            outStream.writeObject(subjects);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Student> getStudentList()
    {
        ArrayList<Student> students = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
            students= (ArrayList<Student>) inputStream.readObject();
            inputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return students;
    }
    public static ArrayList<Subject> getSubjectList()
    {
        ArrayList<Subject> subjects = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
            subjects = (ArrayList)inputStream.readObject();
            inputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return subjects;
    }
}