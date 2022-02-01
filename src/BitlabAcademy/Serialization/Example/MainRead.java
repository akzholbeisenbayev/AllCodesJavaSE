package BitlabAcademy.Serialization.Example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainRead
{
    public static void main(String[] args) {
        ArrayList<User> usersList = new ArrayList();
        try{
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("bitlab.txt"));
            usersList = (ArrayList)inStream.readObject();
            inStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        for(User u : usersList){
            if(u.getName().equals("Timur"))
                System.out.println(u.getName() + " - " + u.getNumber());
        }
    }
}
