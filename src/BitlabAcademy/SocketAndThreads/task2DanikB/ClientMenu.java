package BitlabAcademy.SocketAndThreads.task2DanikB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMenu extends JPanel {
    private JLabel label;
    private JTextField textField;
    private JButton send;
    private ServerConnector sc;

    public ClientMenu(ServerConnector sc) {
        this.sc = sc;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("Message");
        label.setSize(150, 30);
        label.setLocation(80, 200);
        add(label);

        textField = new JTextField("");
        textField.setSize(150, 30);
        textField.setLocation(150, 200);
        add(textField);

        send = new JButton("SEND MESSAGE");
        send.setSize(150, 30);
        send.setLocation(100, 400);
        add(send);
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = textField.getText();
                if (!message.equals("")) {
                    sc.sendMessage(message);
                }
            }
        });

    }
}
