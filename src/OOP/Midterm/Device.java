package OOP.Midterm;

abstract class Device extends Good
{
    private String  cpu; // процессер
    private  int ram; //ОЗУ
    private int count; //количество товаров

    //конструкторы, геттеры сеттеры, абстрактные методы

    abstract int getPerformance();

    //переопределения метода родительского класса
    @Override
    public void getSale(int count)
    {
        System.out.println(count + " goods have sold");
    }

    //переопределения метода родительского класса
    //выводит данные
    @Override
    public void showDetails()
    {
        System.out.print("Model: " + getModel() + " | price: "
                + getPrice() + " | CPU: " + getCpu()
                + " | RAM: " + getRam() + " | count: " + getCount());
    }

    public Device(){}


    public Device(int price, String model, String cpu, int ram, int count)
    {
        super(price, model);
        this.cpu = cpu;
        this.ram = ram;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getCpu()
    {
        return cpu;
    }

    public void setCpu(String cpu)
    {
        this.cpu = cpu;
    }

    public int getRam()
    {
        return ram;
    }

    public void setRam(int ram)
    {
        this.ram = ram;
    }
}

