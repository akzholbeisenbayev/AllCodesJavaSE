package BitlabAcademy.ArrayList.newP;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student student = new Student("fsfas", "fsaf");
        list.add(student); //1

        System.out.println(list.get(0));
//        System.out.println(list.toString());

    }
}
