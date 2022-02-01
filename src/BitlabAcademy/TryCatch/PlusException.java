package BitlabAcademy.TryCatch;

public class PlusException extends Exception
{
    public String getMessage(){
        return "Length of this word is too short";
    }
}
