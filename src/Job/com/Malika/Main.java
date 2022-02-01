package Job.com.Malika;

public class Main
{
    public static void main(String[] args)
    {
        BooksCupboard book1 = new BooksCupboard("Royalty", 5.78);
        System.out.println(book1.getName());
        book1.ves(book1.getWeight());
        book1.prednaznachenie();
    }

}
