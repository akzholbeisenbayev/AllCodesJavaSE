package BitlabAcademy.Threads.task2Students.task2Yalkun;

import javax.swing.*;


public class MainFrame extends JFrame {

    private JButton button;
    private JLabel label;


    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        button = new JButton("FIRE");
        button.setSize(100,30);
        button.setLocation(200,10);

        label = new JLabel("#");
        label.setSize(10,10);
        label.setLocation(100,100);
        add(label);

        button.addActionListener(e -> {
            ThreadSample t = new ThreadSample(label);
            try{
                for(int i = 110; i < 400; i += 10){
                    t.start();
                }
            }catch (Exception y){
                y.printStackTrace();
            }
        });
        add(button);
    }
}