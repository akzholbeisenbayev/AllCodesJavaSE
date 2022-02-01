package FilesSerializations;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите имя файла: ");
        String res = in.nextLine();

        try {
            File file2 = new File(res);
            PrintWriter pw = new PrintWriter(file2);

            List<String> data = new ArrayList<>();


            System.out.println("Файл успешно создан, запишите в файл текст и после окончания нажмите [0]");
            String line = "default";
            int b = 0;
            while (!line.equals("0")) {

                line = in.nextLine();
                if (line.equals("0")) break;
                String[] allData = line.split(" ");

                for (String allDatum : allData) {
                    pw.print(allDatum + " ");
                }

                if (allData.length > 1) {
                    String temp = allData[allData.length - 1];
                    allData[allData.length - 1] = allData[0];
                    allData[0] = temp;
                }
                for (String a : allData) {
                    data.add(a);
                }

            }
            pw.close();

            System.out.println("Текст успешно записан в файл! Хотите выполнить еще операции? ");
            System.out.println("[1] Считать строки из файла и вывести результат в консоль.\n" +
                    "[2] Поменять местами первое и последнее слова в каждой строке и вывести результат в консоль.\n" +
                    "[3] Закрыть программу");

            while (b != 3) {
                b = in.nextInt();
                switch (b) {
                    case 1:
                        Scanner inFile = new Scanner(file2);
                        while (inFile.hasNextLine()) {
                            System.out.println(inFile.nextLine());
                        }
                        inFile.close();
                        break;
                    case 2:
//
                        System.out.println(data.toString());
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Enter a valid argument, please");
                        break;
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Ошибка в записи");
        }
    }
}


