package BitlabAcademy.OOP.task3;

public class Phone {
    String name;
    String model;
    int price;
    public Phone()
    {
        this.name="null";
        this.model="null";
        this.price=0;
    }
    public Phone(String name, String model, int price)
    {
        this.name=name;
        this.model=model;
        this.price=price;
    }
    public String getDate()
    {
        return name + " " + model + " " + price;
    }
}
