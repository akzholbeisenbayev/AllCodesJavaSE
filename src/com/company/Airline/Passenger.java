package com.company.Airline;


//Создаем Абстрактный класс
public class Passenger  extends  Plane{
    //Создаем атрибуты
    private int quantity;
    private int max__flight;

    //Конструктор по умолчанию
    public Passenger() {
    }

    //Конструктор со значениями
    public Passenger(String type, int weight, int capacity, int carrying, int distance, int quantity, int max__flight) {
        super(type, weight, capacity, carrying, distance);
        this.quantity = quantity;
        this.max__flight = max__flight;
    }

    //Метод для вывода информации о самолете
    public void showDetalis(){
        System.out.println("Passenger Plane:");
        System.out.println("Type: " + super.getType() + "\nWeight: " + super.getWeight() + " ton\nCapacity: " + super.getCapacity() + "\nCarrying: " + super.getCarrying() + "\nDistance: " + super.getDistance() + " km\nQuantity of Passengers: " + quantity + "\nMaximum number of flights: " + max__flight + "\n");
    }


    //Геттеры и Сеттеры
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws Exception {
        if (quantity < 0)
        {
            throw new Exception("Quantity can't be less than 0!");
        }
        this.quantity = quantity;
    }

    public int getMax__flight() {
        return max__flight;
    }

    public void setMax__flight(int max__flight) throws Exception {
        if (max__flight < 0)
        {
            throw new Exception("Max_Flight can't be less than 0!");
        }
        this.max__flight = max__flight;
    }


    //toString для вывода объекта
    @Override
    public String toString() {
        return "Passenger{" +
                "quantity=" + quantity +
                ", max__flight=" + max__flight +
                '}';
    }
}
