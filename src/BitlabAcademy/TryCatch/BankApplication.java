package BitlabAcademy.TryCatch;

public class BankApplication {
    public void createUser(String userName) throws UserNameShortException{
        if(userName.length()<5){
            throw new UserNameShortException();
        }else{
            System.out.println("User name " + userName + " is created successfully");
        }
    }
}
