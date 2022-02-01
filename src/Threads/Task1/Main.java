package Threads.Task1;


public class Main
{
    public static void main(String[] args) {

        Thread thread1 = new Thread(new FirstThread());
        Thread thread2 = new Thread(new SecondThread());
        thread1.start();
        thread2.start();


    }
}
