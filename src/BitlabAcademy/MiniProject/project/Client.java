package BitlabAcademy.MiniProject.project;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Socket socket = new Socket("localhost",1402);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true){
                PackageData pd = new PackageData();
                PackageData response_pd = null;
                System.out.println("PRESS 1 TO LIST StudentS\nPRESS 2 TO ADD STUDENTS\nPRESS 0 TO DISCONNECT FROM SERVER");
                String choice = in.next();
                if(choice.equals("1")){
                    pd.setOperationType("1");
                    outputStream.writeObject(pd);
                    if ((response_pd = (PackageData) inputStream.readObject())!=null){
                        for(int i=0; i<response_pd.students.size(); i++){
                            System.out.println(response_pd.students.get(i));
                        }
                        System.out.println("-----");
                    }
                }else if(choice.equals("2")){
                    int new_id = 0;
                    System.out.println("Insert new Student's name:");
                    String new_name = in.next();
                    System.out.println("Insert new Student's surname");
                    String new_surname = in.next();
                    System.out.println("Insert new Student's age");
                    int new_age = in.nextInt();

                    pd.setOperationType("1");
                    outputStream.writeObject(pd);
                    if((response_pd = (PackageData) inputStream.readObject())!=null){
                        new_id = (int) (response_pd.students.get(response_pd.students.size()-1).id + 1);
                    }

                    Students new_student = new Students((long) new_id, new_name, new_surname, new_age);
                    PackageData pd2 = new PackageData();
                    pd2.setOperationType("2");
                    pd2.student = new_student;
                    System.out.println("new student sent!");
                    outputStream.writeObject(pd2);
                }else if(choice.equals("0")){
                    System.exit(0);
                }else {
                    System.out.println("Wrong Input!");
                }
            }
        }catch (Exception e){
            System.out.println("check point1");
            e.printStackTrace();
        }
    }
}