package BitlabAcademy.Threads.Task3;

public class Main
{
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", 100, 500);
        Car car2 = new Car("Mercedes", 50, 400);
        Car car3 = new Car("Ferrari 2", 70, 500);
        Car car4 = new Car("Renault", 100, 500);
        Car car5 = new Car("BMW", 200, 600);
        Car car6 = new Car("BMW 2", 210, 500);
        Car car7 = new Car("BMW 3", 150, 700);
        Car car8 = new Car("BMW 4", 160, 800);
        Car car9 = new Car("Ferrari 3", 140, 500);
        Car car10 = new Car("Ferrari 4", 130, 900);

        Car[] cars={car1, car2,car3,car3,car4,car5,car6,car7,car8,car9,car10};

        try {
            for(int i=0; i<cars.length; i++)
            {
                cars[i].start();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        try{
            for(int i=0; i<cars.length; i++)
            {
                cars[i].join();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        bubbleSort(cars);

        for(int i=0; i<cars.length; i++)
        {
            System.out.println("Place " + (i+1) + ": " + cars[i].getCarName()+ " - " + cars[i].getTime() + " seconds");
        }

    }

    public static void bubbleSort(Car[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i].setTime((int)arr[i].getDistance()/arr[i].getSpeed());
        }

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j].getTime() > arr[j+1].getTime() ){
                Car tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
}
