package BitlabAcademy.Files.SecondExample;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main
{
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            String message = "Hello BITLAB";
            writer.write(message);

            writer.close();
        }catch(Exception except){
            except.printStackTrace();
        }
    }
}
