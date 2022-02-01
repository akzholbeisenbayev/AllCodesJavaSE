package FilesSerializations.serizalization;
import java.io.Serializable;

public class AksAkma implements Serializable
{
    private String type;
    private int strong;
    private String length;

    @Override
    public String toString() {
        return "AksAkma{" +
                "type='" + type + '\'' +
                ", strong=" + strong +
                ", length='" + length + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
