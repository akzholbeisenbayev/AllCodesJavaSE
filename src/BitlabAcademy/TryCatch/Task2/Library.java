package BitlabAcademy.TryCatch.Task2;

public class Library
{
    private String name;
    private String city;
    private Book books[] = new Book[3];
    private int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public void addBook(Book book)
    {
        try {
            books[index] = book;
            index++;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The library is full");
        }
    }

    public void printBooks()
    {
        try {
            System.out.println("Name: " + getName() + ", city: " + getCity());

            for(int i=0; i<books.length; i++)
            {
                System.out.println(books[i].getData());
            }
        }catch (NullPointerException e)
        {
            System.out.println("The book is empty");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
