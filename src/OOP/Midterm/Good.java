package OOP.Midterm;

abstract class Good
{
    private int price;
    private String model;


    public Good(){}

    public Good(int price, String model)
    {
        this.price = price;
        this.model = model;
    }

    public abstract void showDetails();
    public abstract void getSale(int count);


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}