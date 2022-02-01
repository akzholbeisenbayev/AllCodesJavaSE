package BitlabAcademy.GUI.Task1Dauren;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JTextField textField1;
    private JComboBox agesBox;
    private Integer[] ages = new Integer[100];
    private JTextArea area;

    public MainFrame(){
        for(Integer i =0;i<100;i++){
            ages[i]= i;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500,500);
        setLayout(null);

        label = new JLabel("NAME:");
        label.setSize(300,30);
        label.setLocation(50,100);
        add(label);
        label = new JLabel("PHONE:");
        label.setSize(300,30);
        label.setLocation(50,150);
        add(label);
        label = new JLabel("Age:");
        label.setSize(300,30);
        label.setLocation(50,200);
        add(label);

        textField = new JTextField();
        textField.setSize(300,30);
        textField.setLocation(100,100);
        add(textField);
        textField1 = new JTextField();
        textField1.setSize(300,30);
        textField1.setLocation(100,150);
        add(textField1);


        agesBox = new JComboBox(ages);
        agesBox.setSize(300,30);
        agesBox.setLocation(100,200);
        add(agesBox);

        area = new JTextArea();
        area.setSize(300,100);
        area.setLocation(100,300);
        add(area);
        button = new JButton("ADD CONTACT");
        button.setSize(300,30);
        button.setLocation(100,250);
        //Подвязываем объект интерфейса ActionListener к button
        button.addActionListener(new ActionListener(){
            //Так как мы не можем создавать объекты интерфейсов - нам приходится дописывать его абстрактные методы сразу тут
            public void actionPerformed(ActionEvent e){
                //Пишем, что должно произойти при нажатии на кнопку
                String text = textField.getText();
                String text1 = textField1.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if(!text.equals("") && !text1.equals("")){
                    //Делаем append, потому что мы хотим добавить новые элементы с сохранением старых данных. А \n нужен, чтобы каждая новая запись шла в новой строке
                    area.append(text+" "+text1+" "+age+"\n");
                    //Очищаем txtField и agesBox, после успешной операции
                    textField.setText("");
                    textField1.setText("");
                    agesBox.setSelectedIndex(0);


                }
            }


        });
        add(button);
    }
}