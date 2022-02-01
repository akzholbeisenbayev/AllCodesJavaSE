package FilesSerializations;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task1
{

    //1. Создание файлa средствами класса File.
    //   Пользователь указывает имя файла. В случае неудачи записи пользователь видит текст, указанный в exception.
    //2. После создания файла пользователь попадает в раздел меню для записи в файл произвольного текста
    //    — пользователь вводит текст и при нажатии клавиши Enter производится запись текста в файл.
    //   Приложение оповещает о результатaх выполненной операции.
    //3. После успешной записи текста, пользователю предлагается выбрать одну из операций:
    //  1. Считать строки из файла и вывести результат в консоль.
    //  2. Поменять местами первое и последнее слова в каждой строке и вывести результат в консоль.
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String name = cin.next();
        File file = new File(name);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            if(file.exists())
            {
                System.out.println("Enter text, that you want to write to file");
                while (true) {
                    String text = reader.readLine();
                    if (text.equals("Exit")) {
                        break;
                    }
                    writer.write(text + "\n");
                }

                System.out.println("Your message was successfully recorded to file!");
                writer.flush();
                writer.close();

                System.out.println("PRESS [1] to output data from file to console");
                System.out.println("PRESS [2] to change first and last word in each row and output the result to console");

                int choice = 3;
                choice =  cin.nextInt();
                if(choice == 1)
                {
                    try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
                    {
                        String s;
                        while((s = bufferedReader.readLine()) != null)
                        {
                            System.out.println(s);
                        }
                    } catch (FileNotFoundException e)
                    {
                        System.out.println("File didn't find");
                    }
                    catch (NullPointerException e)
                    {
                        System.out.println("Null");
                    }

                } else if(choice == 2)
                {
                    try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
                    {
                        String s1;
                        while((s1 = bufferedReader.readLine()) != null)
                        {
                            String[] arr = s1.split(" ");
                            String temp = arr[0];
                            arr[0] = arr[arr.length - 1];
                            arr[arr.length - 1] = temp;
                            System.out.println(Arrays.toString(arr));
                        }

                    } catch (FileNotFoundException e)
                    {
                        System.out.println("File didn't find");
                    }
                }
            }

        } catch (IOException| InputMismatchException e)
        {
            System.out.println("Error in creating file");
        }
    }
}








