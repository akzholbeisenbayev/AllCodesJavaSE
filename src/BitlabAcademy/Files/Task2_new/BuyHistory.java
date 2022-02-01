package BitlabAcademy.Files.Task2_new;

import java.util.Date;

public class BuyHistory {
    private String goodName;
    private int goodPrice;
    private Date buyTime;

    public BuyHistory(){}


    public BuyHistory(String goodName, int goodPrice){
        this.goodName=goodName;
        this.goodPrice=goodPrice;
        this.buyTime= new Date();
    }

    public BuyHistory(String goodName, int goodPrice, Date date) {
        this.goodName =goodName;
        this.goodPrice=goodPrice;
        this.buyTime = date;
    }

    public void setGoodName(String goodName){ this.goodName=goodName;}
    public String getGoodName(){return goodName;}

    public void setGoodPrice(int goodPrice){ this.goodPrice=goodPrice;}
    public int getGoodPrice(){return goodPrice;}

    public void setBuyTime(Date buyTime){ this.buyTime= buyTime;}
    public Date getBuyTime(){ return buyTime;}

    @Override
    public String toString(){
        return goodName+" - "+goodPrice+" tenge - "+buyTime;
    }
}
