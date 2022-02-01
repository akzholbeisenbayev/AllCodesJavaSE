package BitlabAcademy.SocketAndThreads.task2Serik;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SecondPage extends JPanel {
    private MainFrame parent;
    private JTextField textField;
    private JButton button;

    public SecondPage(MainFrame parent) {
        try {
            Socket socket = new Socket("localhost", 5656);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true) {
                this.parent = parent;
                setSize(500, 500);
                setLayout(null);

                textField = new JTextField();
                textField.setSize(300, 30);
                textField.setLocation(130, 100);
                add(textField);

                button = new JButton("SEND");
                button.setSize(150, 30);
                button.setLocation(50, 300);
                add(button);
                button.addActionListener(new ActionListener() {
                    @Override

                    public void actionPerformed(ActionEvent e) {
                        PackageData pd = new PackageData(textField);
                        try {
                            outputStream.writeObject(pd);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        textField.setText("");
                        try {
                            PackageData pack = (PackageData) inputStream.readObject();
                        } catch (IOException | ClassNotFoundException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}

