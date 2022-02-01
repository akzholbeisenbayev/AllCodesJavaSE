package BitlabAcademy.MiniProject.project;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    public static String operationType;
    ArrayList<Students> students;
    static Students student;

    public PackageData(){}

    public PackageData(String operationType, ArrayList<Students> students, Students student) {
        this.operationType = operationType;
        this.students = students;
        this.student = student;
    }

    public static String getOperationType() {return operationType;}
    public void setOperationType(String operationType) {this.operationType = operationType;}
    public void setStudents(ArrayList<Students> students) {this.students = students;}
    public static Students getStudent() {return student;}
    public void setStudent(Students student) {this.student = student;}
    public static String getPD(ArrayList<Students> students){
        System.out.println(getOperationType() + ", " + getStudent());
        for(Students s: students){
            System.out.println(s);
        }
        return null;
    }
}