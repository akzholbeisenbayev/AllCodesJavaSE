package BitlabAcademy.SocketAndThreads.task2DanikB;

import java.io.Serializable;

public class PackageData implements Serializable {
    private CommandEnum operationType;
    private String text;

    public PackageData(CommandEnum operationType,String text) {
        this.operationType = operationType;
        this.text = text;
    }

    public CommandEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(CommandEnum operationType) {
        this.operationType = operationType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
