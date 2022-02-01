package BitlabAcademy.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNameShortException, InputMismatchException {

        BankApplication bankApplication = new BankApplication();
        bankApplication.createUser("ff");
//        try{
//           String password = in.next();
//            if(password.length()<8)
//                throw new PlusException();
//        } catch (PlusException e) {
//            System.out.println("it is exception");
//        }finally {
//            System.out.println("it is finally");
//        }
//
//        System.out.println("to be continued");
    }
}
