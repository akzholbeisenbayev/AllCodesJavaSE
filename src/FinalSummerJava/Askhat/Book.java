package FinalSummerJava.Askhat;

public class Book
{
    private String name;
    private String janr;
    private String author;
    private int price;
    private int quantity;

    public Book(String name, String janr, String author, int price, int quantity) {
        this.name = name;
        this.janr = janr;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null)
        {
            throw new Exception("Name is null");
        }
        this.name = name;
    }

    public String getJanr() {
        return janr;
    }

    public void setJanr(String janr) throws Exception {
        if (janr == null)
        {
            throw new Exception("Janr is null");
        }
        this.janr = janr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws Exception{
        if(price < 0)
        {
            throw new Exception("Price can't be negative number!!!");
        }
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws Exception {
        if (author == null)
        {
            throw new Exception("Author is null");
        }
        this.author = author;
    }

    public int getQuantity() throws Exception {
        if(quantity < 0)
        {
            throw new Exception("Quantity can't be negative number!!!");
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", janr='" + janr + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

