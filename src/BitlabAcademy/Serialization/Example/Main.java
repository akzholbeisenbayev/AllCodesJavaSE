package BitlabAcademy.Serialization.Example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception {
        ArrayList<User> usersList = new ArrayList();

        usersList.add(new User("Ilyas", 123));
        usersList.add(new User("Timur", 321));
        usersList.add(new User("Aibek", 555));
        usersList.add(new User("Dauren", 777));

        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("bitlab.txt"));
            outStream.writeObject(usersList);
            outStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
