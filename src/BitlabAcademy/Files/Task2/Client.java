package BitlabAcademy.Files.Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ArrayList<BuyHistory>buyHistories=getBuyHistory();
        ArrayList<String>added = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] LIST GOODS"+"\n"+"PRESS [2] BUY GOOD"+"\n"+"PRESS [3] LIST BUY HISTORY"+"\n"+"PRESS [0] TO EXIT");
            int a = in.nextInt();
            if(a==1){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i< goodItems.size();i++){
                    System.out.println((i+1)+". "+goodItems.get(i));
                }
            }else if(a==2){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i< goodItems.size();i++){
                    System.out.println((i+1)+". "+goodItems.get(i));}
                System.out.println("Select the index of the product you want to buy: ");
                int index = in.nextInt();
                BuyHistory.ArrayListadd(goodItems,buyHistories,index);
                saveBuyHistory(buyHistories);
            }else if(a==3){
                buyHistories = getBuyHistory();
                for(int i = 0;i<buyHistories.size();i++){
                    System.out.println((i+1)+". "+buyHistories.get(i));
                }
            }else if(a==0) {
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
        }catch(Exception e){
            e.printStackTrace();
        }

        return goodItems;
    }

    public static ArrayList<BuyHistory> getBuyHistory(){
        ArrayList<BuyHistory>buyHistories = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("buyHistory.txt"));
            String line = "";
            while ((line=bufferedReader.readLine())!=null){
                int goodPrice = Integer.parseInt(bufferedReader.readLine());
                String n =bufferedReader.readLine();
                //   Date buyTime=(Date) bufferedReader.readLine();
                buyHistories.add(new BuyHistory(line,goodPrice));
            }
        }catch (Exception e){
        }return buyHistories;
    }
    public static void saveBuyHistory(ArrayList<BuyHistory>buyHistories){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buyHistory.txt"));
            for(BuyHistory b : buyHistories){
                bufferedWriter.write(b.getGoodName()+"\n");
                bufferedWriter.write(b.getGoodPrice()+"\n");
                bufferedWriter.write(b.getBuyTime()+"\n");
            }bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void setBuyHistory(ArrayList<BuyHistory>buyHistories,ArrayList<GoodItem>goodItems,int k){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("gooditems.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buyHistory.txt"));
            for(k=0;k<1;k++){

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
