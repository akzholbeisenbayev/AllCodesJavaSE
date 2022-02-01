package BitlabAcademy.OOP.F;

public class Client
{
    private int id; // уникальный номер клиента, начинается с 1,2,3,...
    private String name; // имя клиента
    private String time; // время
    private int price; // цена
    private String care; // вид ухода
    private int placeNumber; // место
    private boolean isDeleted; // Если true, то билет удален


    public Client(){}
    public Client(int id,String name, String time, int price, String care, int placeNumber, boolean isDeleted){
        this.id = id;
        this.name = name;
        this.time = time;
        this.price = price;
        this.care = care;
        this.placeNumber = placeNumber;
        this.isDeleted = isDeleted;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getTime(){
        return time;
    }
    public int getPrice(){
        return price;
    }
    public String getCare(){
        return care;
    }
    public int getPlacenumber(){
        return placeNumber;
    }
    public boolean getIsdeleted(){
        return isDeleted;
    }





    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setCare(String care){
        this.care = care;
    }
    public void setPlaceNumber(int placeNumber){
        this.placeNumber = placeNumber;
    }
    public void setIsDeleted(boolean isDeleted){
        this.isDeleted = isDeleted;
    }



    public void getData(){
        System.out.println("Name is: "+name+"."+"  Time: "+time+"."+"  Price: "+price+"."+"  Care: "+care+
                "."+"  Place number: "+placeNumber);
    }
}
