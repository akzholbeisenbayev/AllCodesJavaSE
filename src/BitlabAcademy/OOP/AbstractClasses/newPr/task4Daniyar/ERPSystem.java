package BitlabAcademy.OOP.AbstractClasses.newPr.task4Daniyar;

public class ERPSystem{
    private User[] memory = new User[1000];
    private int sizeOfUsers = 0;

    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printUser(int index){
        if(index <= sizeOfUsers){
            System.out.println(memory[index].getUserData());
        }
        else{
            System.out.println("No such user in this index");
        }
    }

    public void printAllUsers(){
        for(int i = 0; i < sizeOfUsers;i++){
            System.out.println(memory[i].getUserData());
        }
    }
}
