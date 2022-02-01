package Threads;

class TestSleepMethod1 extends Thread
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        for(int i=0; i<4; i++)
            System.out.println(i);
    }


    public static void main(String args[]){
        TestSleepMethod1 t1=new TestSleepMethod1();
        TestSleepMethod1 t2=new TestSleepMethod1();
        TestSleepMethod1 t3=new TestSleepMethod1();

        t1.setPriority(3);
        t2.setPriority(4);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
    }
}
