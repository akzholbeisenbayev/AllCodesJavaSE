package BitlabAcademy.TryCatch.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int age;
        int sum = 0;
        String text = "";

        User[] users = new User[5];

        for(int i=0; i< users.length; i++) {
            System.out.print("Insert Name: ");
            String name = in.next();

            System.out.print("Insert Surname: ");
            String surname = in.next();

            try {
                System.out.print("Insert Age: ");
                age = in.nextInt(); //"fasf"
            } catch (InputMismatchException e) {
                age = 0;
                text += age; //text="0";
            }

            if(text.equals("0")) {
                String text2 = in.next();
            }

            text = "";

            users[i] = new User(name,surname,age);
            sum+=users[i].age;
        }

        System.out.println("AVG: " + sum/users.length);
    }
}
//public class Main {
//    public static void main(String[]args){
//        Scanner in = new Scanner(System.in);
//        User [] users = new User[5];
//        String name = "";
//        String surname = "";
//        int age;
//        int sum = 0;
//        for (int i = 0; i < users.length; i++) {
//            try {
//                System.out.print("name: ");
//                name = in.next();
//                System.out.print("surname: ");
//                surname = in.next();
//                System.out.print("age: ");
//                age = in.nextInt();
//            }catch (InputMismatchException e){
//                age=0;
//            }
//            sum+=age;
//            users[i] = new User(name,surname,age);
//        }
//        System.out.println(sum/5);
//    }
//}

