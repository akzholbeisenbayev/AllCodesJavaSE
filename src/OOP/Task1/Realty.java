package OOP.Task1;

public abstract class Realty
{
    private String type;
    private String city;
    private int roomCount;
    private long price;

    public Realty(String type, String city, int roomCount, long price) {
        this.type = type;
        this.city = city;
        this.roomCount = roomCount;
        this.price = price;
    }


    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", city='" + city + '\'' +
                ", roomCount=" + roomCount +
                ", price=" + price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


}
