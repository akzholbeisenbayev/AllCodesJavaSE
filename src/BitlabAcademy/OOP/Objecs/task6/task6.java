package BitlabAcademy.OOP.Objecs.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class task6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();//0

        int a = 5;

        while(a!=0){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");

            a = in.nextInt();

           if(a==0) break;

            else if(a == 1)
            {
                Student b = new Student();
                System.out.println("Insert name");
                b.name = in.next();

                System.out.println("Insert surname");
                b.surname = in.next();

                System.out.println("Insert GPA");
                b.gpa = in.nextDouble();
                arr.add(b); //ArrayList<Student> arr
            }
            else if(a == 2)
            {
                for(int i = 0;i < arr.size(); i++)
                {
                    System.out.println(arr.get(i).getData());
                }
            }
        }
    }
}
