package BitlabAcademy.Serialization.Task1.task1Akzhol;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable
{
    private String name;
    private String surname;
    private ArrayList<Subject> subjects = new ArrayList();

    public Student(String name1, int credits)
    {}
    public Student(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public void addSubject(Subject subject)
    {
        subjects.add(subject);
    }

    public void getData()
    {
        System.out.println("name= " + name + ", surname= " + surname  + ", subjects= ");

        for (Subject sb : subjects) { //напрямую с объектами
            //sb = physics6
            //subjects:
            //physics5, physics6, physics7

            System.out.println(sb.toString());//physics6.toString();
        }

        for(int i=0; i<subjects.size(); i++) //через индексы
        {
            //i=0;
            //subjects.get(0) = physics5
            //physics5.toString()
            System.out.println(subjects.get(i).toString());
        }

    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
