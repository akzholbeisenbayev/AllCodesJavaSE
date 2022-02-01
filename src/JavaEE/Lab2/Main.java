package JavaEE.Lab2;


import java.time.LocalDate;
import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Print students last names separated by comma.
//Print average GPA of whole class.
//Print city names which consist 'a' char.
//     It should be case insensitive and print city name without duplications separated by comma.
//Print student's last names separated by comma with submission date before 2021-09-26.
//Print student's FirstName, LastName and GPA information by GPA from highest to lowest.
//Print student (FirstName, LastName and GPA) with highest and lowest gpa.

public class Main
{
    public static void main(String[] args)
    {
        List<Student> studentList = Student.getStudents();


        System.out.println("-----------------TASK #1----------------------");
//        for(Student e:Student.getStudents()) {
//            System.out.print(e.getLastName() + ", ");
//        }

        studentList.stream().map(Student::getLastName).collect(Collectors.toList()).forEach(s -> System.out.print(s+", "));

        System.out.println();
        System.out.println("-----------------TASK #2----------------------");
        System.out.println();
        double avg = 0;
        int sum =0;
        for(Student e:Student.getStudents()) {
            avg += e.getGpa();
            sum++;
        }
        avg /= sum;
        System.out.println("average GPA of whole class: " + avg);

        System.out.println();
        System.out.println("-----------------TASK #3----------------------");
        System.out.println();

        for(Student e:Student.getStudents()) {
            int isT = 0;
            for(int i=0; i<e.getCity().length(); i++) {
                if (e.getCity().charAt(i) == 'a')
                    isT++;
            }
                if(isT>0)
                    System.out.println(e.getCity());

        }

        System.out.println();
        System.out.println("00-----------------TASK #4----------------------");
        System.out.println();

        Object[] array = Arrays.stream(Student.getStudents().toArray()).distinct().toArray(Object[]::new);


        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("-----------------TASK #5----------------------");
        System.out.println();

        LocalDate myDate = LocalDate.of(2021, 9, 26);
        for(Student e:Student.getStudents()) {
            if(e.getLastSubmissionDate().isBefore(myDate))
                System.out.print(e.getLastName() + ", ");
        }
        System.out.println();
        System.out.println("-----------------TASK #6----------------------");
        System.out.println();


      //  List<Object> list = new ArrayList<Object>();
    //       list.stream().


     //   studentList.stream().sorted(new StudentComparator()).forEach(x-> System.out.println(x.getFirstName() + ", " + x.getLastName() + ", " + x.getGpa()));

        studentList.stream().sorted(Comparator.comparingDouble(Student::getGpa).reversed()).forEach(x-> System.out.println(x.getFirstName() + ", " + x.getLastName() + ", " + x.getGpa()));;

        System.out.println();
        System.out.println("-----------------TASK #7----------------------");
        System.out.println();

        //**********Solution WITHOUT StreamAPI **********************

//        double maxi = Double.MIN_VALUE, mini = Double.MAX_VALUE;
//        Student maxiI = new Student();
//        Student miniI = new Student();
//
//        for(Student e:Student.getStudents()) {
//            if (e.getGpa() > maxi) {
//                maxi = e.getGpa();
//                maxiI = e;
//            }
//
//            if(e.getGpa() < mini)
//            {
//                mini = e.getGpa();
//                miniI = e;
//            }
//        }
//
//        System.out.println(maxiI.getFirstName()+ ", " + maxiI.getLastName() + ", " + maxiI.getGpa());
//        System.out.println(miniI.getFirstName()+ ", " + miniI.getLastName() + ", " + miniI.getGpa());
//

        //**********Solution with StreamAPI **********************

        studentList.stream().max(Comparator.comparingDouble(Student::getGpa)).ifPresent(x-> System.out.println(x.getFirstName() + ", " + x.getLastName() + ", " + x.getGpa()));;
        studentList.stream().min(Comparator.comparingDouble(Student::getGpa)).ifPresent(x-> System.out.println(x.getFirstName() + ", " + x.getLastName() + ", " + x.getGpa()));;



        System.out.println();
        System.out.println("-----------------TASK #8----------------------");

        //Convert list to set.
        Set<Student> studentSet = Set.copyOf(studentList);


        //Convert list to map, where key is student’s last name, value is gpa. Resolve key conflict by setting existing (key, value).
        Map<String, Double> studentMap = studentList.stream().
                collect(Collectors.toMap(Student::getLastName, Student::getGpa));

//In map, print student "Mcneill".


        if(studentMap.containsKey("Mcneill"))
            System.out.println(studentMap.toString());

//In map, add 0.08 to GPA for every student and print them.

    }
}

class StudentComparator implements Comparator<Student>{

    public int compare(Student a, Student b){
        return a.getGpa().compareTo(b.getGpa());
    }
}