package BitlabAcademy.Threads.Task3;

public class Car extends Thread
{
    private String name;
    private int speed;
    private double distance;
    private int time;

    public Car(String name, int speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= getDistance() / getSpeed(); i++) {
                System.out.println(getCarName() + " is in " + (i * speed) + " meters");
                Thread.sleep(500);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCarName() {
        return name;
    }

    public void setCarName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
