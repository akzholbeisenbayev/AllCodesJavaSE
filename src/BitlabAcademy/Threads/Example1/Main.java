package BitlabAcademy.Threads.Example1;

public class Main
{
    public static void main(String[] args) {
        ThreadSample ts1 = new ThreadSample("t1");
        ThreadSample ts2 = new ThreadSample("t2");
        ThreadSample ts3 = new ThreadSample("t3");
        ts1.start(); //0
        ts2.start(); //0
        ts3.start(); //0


    }
}
