package BitlabAcademy.OOP.Task6.task62;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //1) while(true){}
        //2) press 1, press 2,  press 0
        //3) переменная = ?
        //4) if(переменная == 1)  -> name, duration, teacher -> в Объект Subject -> subjects[index] = subject; index++;
        //5) else if(переменная ==2) -> for(int i=0; i<index; i++) {sout(tab) }
        //6) else  if( переменная  ==  0) -> break;
        //7) до  while создать массив subjects[]
        //8) int index = 0;

            Students memory[] = new Students[10];
            int index = 0;

            Scanner in = new Scanner(System.in);

            while (true) {
                System.out.println("_____");
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO LIST STUDENT");
                System.out.println("PRESS [0] TO EXIT");

                String variant = in.next();

                if (variant.equals("1"))
                {
                    System.out.println("Insert name:");
                    String name=in.next();
                    System.out.println("Insert surname");
                    String surname = in.next();
                    System.out.println("Insert GPA:");
                    double gpa = in.nextDouble();

                    Students s = new Students(index+1, name, surname, gpa);  //id = 2

                    memory[index] = s; //memory[1] = s
                    index++; //0+1=1+1=2;
                } else if (variant.equals("2"))
                {
                    for (int i = 0; i < index; i++)
                    {
                        System.out.println(memory[i].getStudentsData()); //memory[0].getStudentsData
                    }
                }else if (variant.equals("0")) {
                    break;
                } else {
                    System.out.println("Wrong command, try again");
                }
            }
        }
    }