package BitlabAcademy.OOP.AbstractClasses.Task4;

public class ERPSystem
{
    private User []memory = new User[1000]; ////максимум 1000 пользователей
    private int sizeOfUsers = 0;



    void addUser(User u)
    {
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    void printAllUsers()
    {
        if(sizeOfUsers == 0)
            System.out.println("No users in DB, please add someone");

        for(int i=0; i<sizeOfUsers; i++)
        {
            System.out.println(memory[i]);
        }
    }

    void printUser(int index)
    {
        if(memory[index]==null)
        {
            System.out.println( "No such user in this index");
        }
        else System.out.println(memory[index]);
    }
}
