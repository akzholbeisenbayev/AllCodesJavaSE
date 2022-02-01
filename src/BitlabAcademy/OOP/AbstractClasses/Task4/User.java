package BitlabAcademy.OOP.AbstractClasses.Task4;

public abstract class User
{
    private int id;
    private String login;
    private String password;

    public User(){}

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }


    public abstract String getUserData();



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
