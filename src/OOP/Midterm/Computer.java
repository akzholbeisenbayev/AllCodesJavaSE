package OOP.Midterm;

class Computer extends Device
{
    private boolean ssd;
    private int memory;

    public Computer() { }

    public Computer(int price, String model, String cpu, int ram, int count, boolean ssd, int memory)
    {
        super(price, model, cpu, ram, count);
        this.ssd = ssd;
        this.memory = memory;
    }

    @Override
    int getPerformance()
    {
        return  getPrice();
    }

    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.print(" | SSD: " + isSsd() + " | Memory: " + getMemory());
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}