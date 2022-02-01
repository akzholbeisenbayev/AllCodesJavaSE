package OOP.Task1;

//аренда
public class Rentals extends Realty implements Comparable<Rentals>, Cloneable
{
  private int duration;

    public Rentals(String type, String city, int roomCount, long price, int duration) {
        super(type, city, roomCount, price);
        this.duration = duration;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Rentals o)
    {
        return o.getType().compareTo(getType());
    }

    public void polymorph(int dur)
    {
        System.out.println(dur);
    }

    public void polymorph(String city)
    {
        System.out.println(city);
    }

    @Override
    public String toString() {
        return super.toString() +
                " duration=" + duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
