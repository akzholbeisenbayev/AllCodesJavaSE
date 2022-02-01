package Job.com.zadacha2;



import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        Restaurant r1 = new Restaurant("Rixos", "USA", "Astana", 2019, 150);
        Restaurant r2 = new Restaurant("Mushket", "China", "Astana", 1997, 54);
        Restaurant r3 = new Restaurant("Solnce", "Russia", "Almaty", 2019, 120);
        Restaurant r4 = new Restaurant("Otbasy", "Kazakhstan", "Almaty", 2019, 50);
        Restaurant r5 = new Restaurant("Luan", "China", "Astana", 1999, 131);
        Restaurant r6 = new Restaurant("Gerc", "Germany", "Moscow", 2019, 77);

        ArrayList<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);
        restaurants.add(r5);
        restaurants.add(r6);

        System.out.println("Spisok kitaiskih restoranod v Astane, otkrytyh do 2000 goda:");
        for(Restaurant r:restaurants)
        {
            if(r.getCountry().equals("China") && r.getCity().equals("Astana") && r.getYear() < 2000)
            {
                System.out.println(r.toString());
            }
        }

        System.out.println();

        int count = 0;
        for(Restaurant r:restaurants)
        {
            count +=r.getStaffnumber();
        }

        System.out.println("Srednee kolichestvo sotrydnikov restorana = " + count/restaurants.size());
        System.out.println();

        restaurants.sort(Comparator.comparing(Restaurant::getName));

        System.out.println("After sorting by name: ");
        System.out.println();
        for(Restaurant r:restaurants)
        {
            System.out.println(r.toString());
        }

    }
}


class Restaurant
{
    private String name;
    private String country;
    private String city;
    private int year;
    private int staffnumber;

    public Restaurant(String name, String country, String city, int year, int staffnumber) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.year = year;
        this.staffnumber = staffnumber;
    }

    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                        ", country = '" + country + '\'' +
                        ", city = '" + city + '\'' +
                        ", year = " + year +
                        ", staffnumber = " + staffnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStaffnumber() {
        return staffnumber;
    }

    public void setStaffnumber(int staffnumber) {
        this.staffnumber = staffnumber;
    }
}
