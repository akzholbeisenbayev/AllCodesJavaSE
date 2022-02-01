package Threads.Task1;

public class FirstThread implements Runnable
{

    @Override
    public void run() {
        int x=1000000;

        while(x>=0){
            System.out.println(x);
            x--;
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}
