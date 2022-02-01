package BitlabAcademy.Serialization.newExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("dasdas", 123));
        userList.add(new User("asf", 12334));
        userList.add(new User("safa", 1253));

        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user.etf"));
            outputStream.writeObject(userList);
            outputStream.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
