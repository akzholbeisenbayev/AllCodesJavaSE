package OOP.Midterm;


class Laptop extends Computer
{
    private double weight;
    private boolean touch;

    public Laptop(int price, String model, String cpu, int ram, int count, boolean ssd, int memory,  double weight, boolean touch)
    {
        super(price, model, cpu, ram,  count, ssd, memory);
        this.weight = weight;
        this.touch = touch;
    }

    @Override
    int getPerformance() {
        return getPrice();
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.print(" | Weight: " + getWeight() + " kg | Touch: " + isTouch());
        System.out.println();
        System.out.println("Performance: " + getPerformance());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTouch() {
        return touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }
}

