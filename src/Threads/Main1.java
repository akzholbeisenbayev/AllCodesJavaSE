package Threads;


import java.io.*;
import java.nio.file.Path;


public class Main1
{
    public static void main(String[] args)
    {


        Aks a1 = new Aks("1");
        Thread t1 = new Thread(a1);

        Aks a2 = new Aks("2");
        Thread t2 = new Thread(a2);
        Aks a3 = new Aks("3");
        Thread t3 = new Thread(a3);
        Aks a4 = new Aks("4");
        Thread t4 = new Thread(a4);
        Aks a5 = new Aks("5");
        Thread t5 = new Thread(a5);
        Aks a6 = new Aks("6");
        Thread t6 = new Thread(a6);
        Aks a7 = new Aks("7");
        Thread t7 = new Thread(a7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

//        String separator = File.separator;
//        String path = separator + "Users" + separator + "user" + separator +  "Desktop" + separator +  "Aks.txt";
//        File file1 = new File(path);
//
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file1)))
//        {
//
//        }catch (IOException e)
//        {
//            System.out.println("Error in input/output");
//        }

    }
}

class Aks implements Runnable
{
    String aname;

    public Aks(String aname) {
        this.aname = aname;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has started");
        read();
        System.out.println(Thread.currentThread().getName() + " has ended");

    }

    synchronized void read()
    {
        String s = "";
        synchronized (s)
        {
            String separator = File.separator;
            String path = separator + "Users" + separator + "user" + separator + "Desktop" + separator + "Aks.txt";
            File file = new File(path);

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                while ((s = reader.readLine()) != null) {
                    String[] line = s.split(" ");

                    for (String t : line) {
                        System.out.println(t);
                        Thread.sleep(100);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error in reading file");
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }

}
