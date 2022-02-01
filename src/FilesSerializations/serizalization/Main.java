package FilesSerializations.serizalization;

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        AksAkma love = new AksAkma();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("Scala&Malyshka.txt");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            while(true)
            {
                String text = reader.readLine();
                if(text.toLowerCase().equals("exit"))
                    break;
                writer.write(text + "\n");
            }
            writer.flush();
        } catch (IOException e)
        {
            System.out.println("Error in writing data");
        }


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
        {
            String s;
            while((s = bufferedReader.readLine()) != null)
            {
                String[] line = s.split(" ");
                love.setType(line[0]);
                love.setStrong(Integer.parseInt(line[1]));
                love.setLength(line[2]);
            }
            System.out.println(love.toString());
        } catch (IOException e)
        {
            System.out.println("Error in writing data");
        }


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("toAkma.txt")))
        {
            oos.writeObject(love);
            oos.close();
        }catch (FileNotFoundException e)
        {
            System.out.println("File not founded");
        }catch (IOException e)
        {
            System.out.println("Invalid input/output data");
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("toAkma.txt")))
        {
            AksAkma temp = new AksAkma();
            temp = (AksAkma)ois.readObject();
            System.out.println("_______________________________________________");
            System.out.println("After deserialization");
            System.out.println(temp.toString());
        }catch (FileNotFoundException e)
        {
            System.out.println("File not founded");
        }catch (IOException e)
        {
            System.out.println("Invalid input/output data");
        } catch (ClassNotFoundException e)
        {
            System.out.println("class not founded");
        }
    }
}
