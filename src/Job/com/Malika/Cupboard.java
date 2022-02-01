package Job.com.Malika;

public abstract class Cupboard implements Furniture
{
    private String name;

    public Cupboard(String name)
    {
        this.name = name;
    }

    public abstract void ves(double weight);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void prednaznachenie() {
        System.out.println(getName() + " shkaf predhaznachen dlya hranenya veshei");
    }
}
