package BitlabAcademy.Files.Task2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("PRESS [1] ADD GOOD"+"\n"+"PRESS [2] LIST GOODS"+"\n"+"PRESS [3] DELETE GOOD"+"\n"+"PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert price:");
                int price = in.nextInt();

                GoodItem goodItem = new GoodItem(name,price);
                ArrayList<GoodItem>goodItems = getGoodItemList();
                goodItems.add(goodItem);
                saveGoodItems(goodItems);
            }else if(choice==2){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i< goodItems.size();i++){
                    System.out.println((i+1)+". "+goodItems.get(i));
                }
            }else if(choice==3){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i< goodItems.size();i++){
                    System.out.println((i+1)+". "+goodItems.get(i));
                }
                System.out.println("Insert index of Good item to delete:");
                int index = in.nextInt();
                goodItems.remove(index-1);
                saveGoodItems(goodItems);
            }else if(choice==0){
                System.exit(0);
            }
        }
    }
    public static ArrayList<GoodItem> getGoodItemList(){
        ArrayList<GoodItem>goodItems = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("gooditems.txt"));
            String line = "";
            while ((line=bufferedReader.readLine())!=null){
                int price = Integer.parseInt(bufferedReader.readLine());
                goodItems.add(new GoodItem(line,price));
            }
        }catch (Exception e){
        }return goodItems;
    }
    public static void saveGoodItems(ArrayList<GoodItem>goodItems){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("gooditems.txt"));
            for(GoodItem g : goodItems){
                bufferedWriter.write(g.getName()+"\n");
                bufferedWriter.write(g.getPrice()+"\n");
            }bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
