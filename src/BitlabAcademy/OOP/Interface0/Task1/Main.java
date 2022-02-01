package BitlabAcademy.OOP.Interface0.Task1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Aida", "Aiyapbergenova") ;
        User user2 =new User("Aidana", "Sarsenova");
        User user3 = new User("Nurdana", "Isagalieva");
        User user4 = new User("Azamat", "Karazhanov");
        User user5 = new User("Gulbarshyn", "Utegen");
        User user6 = new User("Nurai", "Meirasheva");
        User user7 = new User("Zarina", "Meirasheva");
        User user8 = new User("Asilanbek", "Maksat");
        User user9 = new User("John", "Zhaksylyk");
        User user10 = new User("Doskhan", "Smith");

        User[] users={user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};
        UserBeanImp us1 = new UserBeanImp(users);
        us1.getAllUsers();
        System.out.println("__________________________________________________");
        us1.getUsersByName("John");
        System.out.println("__________________________________________________");
        us1.getUsersBySurname("Smith");

    }
}