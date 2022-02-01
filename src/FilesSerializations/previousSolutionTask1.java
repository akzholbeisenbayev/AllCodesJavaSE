package FilesSerializations;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class previousSolutionTask1 {

    static ArrayList<String[]> text;

    public static void main(String[] args) {

        System.out.print("Enter name of the file(without extension): ");
        String fileName = new Scanner(System.in).next();
        String file = fileName + ".txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            System.out.println("File has been created.");
            System.out.println("Enter text into the file:");
            System.out.println("Enter 'Exit' to end writing");
            Scanner readerLine = new Scanner(System.in);
            while (true)
            {
                String s = readerLine.nextLine();
                if(s.toLowerCase().equals("exit"))
                    break;
                writer.write(s + "\n");
            }

            System.out.println("Your text has been written.");
        }
        catch (Exception e){
            e.printStackTrace();
        }


        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            text = new ArrayList<>();
            String res = "";
            while (true){
                String s = reader.readLine();
                if(s == null)
                    break;
                String[] line = s.split(" ");
                text.add(line);
            }

            while (true){
                System.out.println("What do you want to do? ");
                System.out.println("1.Read the file");
                System.out.println("2.Swap first and last words in the file and show it");
                System.out.println("3.Exit");

                int choice = new Scanner(System.in).nextInt();

                if(choice == 1){
                    readWords();
                }
                else if(choice == 2){
                    for(String[] words: text){
                        if(words.length <= 1)
                            continue;
                        String temp = words[0];
                        words[0] = words[words.length - 1];
                        words[words.length - 1] = temp;
                    }
                    readWords();

                }
                else if(choice == 3)
                    System.exit(1);
                else
                    System.out.println("Please, enter correct data!");
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void readWords(){
        for(String[] words: text){
            for(String word: words){
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}