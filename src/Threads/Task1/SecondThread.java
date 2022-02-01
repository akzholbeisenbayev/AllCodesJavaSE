package Threads.Task1;

public class SecondThread implements Runnable
{

    @Override
    public void run() {
        int x =0;
        while(x<=1000000) {
            System.out.println(x);
            x++;
        }
    }
}
