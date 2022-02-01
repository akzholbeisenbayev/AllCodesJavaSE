package KaspiPreparation.ThreadsAndNetwork.DefenceTask;

public class Book
{
    private int id;
    private String name;
    private String author;

    public Book(int id, String name, String author)
    {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }

   public int getId()
   {
       return id;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }
}
