package OOP.Midterm;

class SmartPhone extends Device
{
    private double mgpx;
    private String generation;

    public SmartPhone(){}

    public SmartPhone(int price, String model, String cpu, int ram, int count, double mgpx, String generation) {
        super(price, model, cpu, ram, count);
        this.mgpx = mgpx;
        this.generation = generation;
    }

    @Override
    int getPerformance()
    {
        return getPrice();
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.print(" | Camera: " + getMgpx() + " | Generation: " + getGeneration());
        System.out.println();
        System.out.println("Performance: " + getPerformance());
    }

    public double getMgpx() {
        return mgpx;
    }

    public void setMgpx(double mgpx) {
        this.mgpx = mgpx;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
}

