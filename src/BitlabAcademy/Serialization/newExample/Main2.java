package BitlabAcademy.Serialization.newExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main2
{
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user.etf"));
            userList = (ArrayList) inputStream.readObject();
            inputStream.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        for(User u:userList)
        {
            System.out.println(u.getName() + " " + u.getNumber());
        }
    }
}
