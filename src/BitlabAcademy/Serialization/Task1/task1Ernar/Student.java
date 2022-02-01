package BitlabAcademy.Serialization.Task1.task1Ernar;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private String surname;
    private ArrayList<Subject>subjects=new ArrayList<>();

    public void addSubjects(Subject subject)
    {
        subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
