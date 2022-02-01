package BitlabAcademy.Serialization.Task2.task2Ernar;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {

    private String gameName;
    private String ipAddress;
    private int port;
    private ArrayList<Players> players = new ArrayList<>();

    public void addPlayer (Players player){
        players.add(player);
    }

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
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

    public ArrayList<Players> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Players> players) {
        this.players = players;
    }

    public String toString(){
        return "Game's Name:"+gameName+"  Ip Address:"+getIpAddress()+"  Port:"+getPort();
    }
}