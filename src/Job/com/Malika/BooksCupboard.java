package Job.com.Malika;

public class BooksCupboard extends Cupboard
{
    private double weight;

    public BooksCupboard(String name, double weight)
    {
        super(name);
        this.weight = weight;
    }

    @Override
    public void ves(double weight) {
        System.out.println("ves knizhnego shkafa = "  + getWeight() + " kg");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
