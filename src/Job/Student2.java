package Job;

public class Student2 extends Person
{
    private int year;
    private String favoriteSubject;

    public Student2(String name, String surname, int year, String favoriteSubject) {
        super(name, surname);
        this.year = year;
        this.favoriteSubject = favoriteSubject;
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                "year=" + year +
                ", favoriteSubject='" + favoriteSubject + '\'' +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }
}
