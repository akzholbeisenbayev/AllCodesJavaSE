package BitlabAcademy.SocketAndThreads.Task2;
import javax.swing.*;
import java.io.Serializable;

public class PackageData implements Serializable {
    private JTextField textField;

    public PackageData(JTextField textField) {
        this.textField = textField;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }
}