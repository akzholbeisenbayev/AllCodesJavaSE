package BitlabAcademy.Files.Task2;

import java.util.ArrayList;
import java.util.Date;

public class BuyHistory {
    private String goodName;
    private int goodPrice;
    private Date buyTime;

    public String getGoodName() {
        return goodName;
    }

    ArrayList<BuyHistory>buyHistories= new ArrayList<>();

    public static void ArrayListadd (ArrayList<GoodItem>goodItems,ArrayList<BuyHistory>buyHistories,int in){
        in= in-1;
        BuyHistory buyHistory = new BuyHistory(goodItems.get(in).getName(), goodItems.get(in).getPrice());
        buyHistories.add(buyHistory);
    }
    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(int goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String toString(){
        return "Good Name: "+getGoodName()+"  Good Price: "+getGoodPrice()+"  Buy Time: "+getBuyTime();
    }
    public BuyHistory(String goodName,int goodPrice){
        this.goodName=goodName;
        this.goodPrice=goodPrice;
        this.buyTime= new Date();
    }
}
