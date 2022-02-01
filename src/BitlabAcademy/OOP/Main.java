package BitlabAcademy.OOP;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        People people1 = new People("Arman","Armanov",19, 180);

        People people2 = new People();
        people2.setName("Aidos");

        System.out.println(people2.getName().equals("Aidos"));

        People people3 = new People("Arman","Armanov",19, 180);
        People people4 = new People("Arman","Armanov",19, 180);
        People people5 = new People("Arman","Armanov",19, 180);

        People[] people =  {people1, people2, people3, people4, people5};

        for(int i=0; i<people.length; i++)
        {
            people[i].getData();
        }




    }
}


