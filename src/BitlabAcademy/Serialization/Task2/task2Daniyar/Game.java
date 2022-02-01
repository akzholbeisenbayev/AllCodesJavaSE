package BitlabAcademy.Serialization.Task2.task2Daniyar;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable
{
    private String gameName;
    private String ipAddress;
    private int port;
    private ArrayList<Game> players = new ArrayList();

    public Game() {
    }

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void getData()
    {
        System.out.println(getGameName()+ ", " + getIpAddress() + ", " + getPort() + ", ");
        for(int i=0; i<players.size(); i++)
        {
            System.out.println(players.get(i).toString());
        }
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}