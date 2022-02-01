package BitlabAcademy.Threads.Task1;

public class Main {
    public static void main(String[]args){
        Operation ts1 = new Operation("f1", 1);
        Operation ts2 = new Operation("f2",2);
        Operation ts3 = new Operation("f3",3);
        Operation ts4 = new Operation("f4",4 );
        Operation ts5 = new Operation("f5",5);
        Operation ts6 = new Operation("f6",6);
        Operation ts7 = new Operation("f7", 7);
        Operation ts8 = new Operation("f8",8);
        Operation ts9 = new Operation("f9",9);
        Operation ts10 = new Operation("f10",10);
        ts1.start();
        ts2.start();
        ts3.start();
        ts4.start();
        ts5.start();
        ts6.start();
        ts7.start();
        ts8.start();
        ts9.start();
        ts10.start();
    }
}
