package BitlabAcademy.SocketAndThreads.task2DanikB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;


public class MainMenu extends JPanel {
    private MainFrame application;

    private JLabel label;
    private JTextField textfield;
    private JTextField textfield1;
    private JButton connect;
    private Socket socket;
    private ServerConnector sc;

    public MainMenu(MainFrame application){
        this.application = application;

        setSize(500,500);
        setLayout(null);

        label = new JLabel("ip");
        label.setSize(150,30);
        label.setLocation(50,200);
        add(label);

        label = new JLabel("port");
        label.setSize(150,30);
        label.setLocation(50,250);
        add(label);

        textfield = new JTextField("");
        textfield.setSize(150,30);
        textfield.setLocation(100,200);
        add(textfield);

        textfield1 = new JTextField("");
        textfield1.setSize(150,30);
        textfield1.setLocation(100,250);
        add(textfield1);

        connect = new JButton("CONNECT");
        connect.setSize(300,30);
        connect.setLocation(100,400);
        add(connect);
        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ip = textfield.getText();
                Integer port = Integer.parseInt(String.valueOf(textfield1.getText()));
                if (!ip.equals("") && !port.equals(null)) {
                    try {
                        socket = new Socket(ip, port);
                        sc = new ServerConnector(socket);

                        textfield.setText("");
                        textfield1.setText("");

                        JFrame frame = new JFrame();
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setTitle("Bitlab Application");
                        frame.setSize(500,500);
                        frame.setLayout(null);

                        ClientMenu panel = new ClientMenu(sc);
                        frame.add(panel);
                        frame.setVisible(true);


                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }
}