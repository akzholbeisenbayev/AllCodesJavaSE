package BitlabAcademy.Threads.Task2;

public class ThreadButton extends Thread
{
    MainFrame mainFrame =  new MainFrame();
        @Override
        public void run() {
            try {
                    for(int i=0; i<10; i++) {
                        //0 do 1 //0.1 0.2 (random * (b-a)) +a  (a, b]
                        int x =  (int) (Math.random() * (400 - 100)) + 100;
                        int y =  (int) (Math.random() * (400 - 100)) + 100;
                        Main.frame.label.setLocation(x*i, y*i);
                        Thread.sleep(700);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        public ThreadButton() {
        }
}
