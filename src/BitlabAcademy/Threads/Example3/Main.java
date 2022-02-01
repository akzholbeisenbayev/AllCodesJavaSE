package BitlabAcademy.Threads.Example3;

public class Main {
    public static void main(String[] args) {
        DemoThread dt1 = new DemoThread("First");
        DemoThread dt2 = new DemoThread("Second");
        DemoThread dt3 = new DemoThread("Third");


        //Cтавим на пазу и ждем, пока все завершатся
        try{
            System.out.println("Waiting all threads");
            //dt1.t.join();
            dt2.t.join();
            dt3.t.join();

        }catch (Exception e){
            System.out.println("Thread interrupted");
        }

        System.out.println("Thread" + dt1.name + " is alive:" + dt1.t.isAlive());

    }
}