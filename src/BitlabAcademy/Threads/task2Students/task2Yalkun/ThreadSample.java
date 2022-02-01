package BitlabAcademy.Threads.task2Students.task2Yalkun;
import javax.swing.*;

public class ThreadSample extends Thread{
    private JLabel label;

    public ThreadSample() {
    }

    public ThreadSample(JLabel label) {
        this.label = label;
    }

    public void run(){
        try {
            for(int i = 100; i <400; i+=10){
                label.setLocation(i,100);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
