package BitlabAcademy.OOP.Inheritance.task6;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    User(){}
    User(String login, String password, String name, String surname){
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){return id;}

    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin(){return login;}

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){return password;}

    public void setName() {
        this.name = name;
    }
    public String getName(){return name;}

    public void setSurname(){
        this.surname = surname;
    }
    public String getSurname(){return surname;}

    public void getData(){
        System.out.print(getLogin()+" "+getPassword()+" "+getName()+" "+getSurname());
    }

}

