package Threads;

import java.util.Arrays;

public class Operation extends Thread
{
    private String operationName;
    private int operationTime;
    int res;
    public Operation(String operationName, int operationTime)
    {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
      res += getOperationTime();
        try
        {
            System.out.println("Operation " + getOperationName() + ": " + res + " second");
            Thread.sleep(1000);
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public int getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(int operationTime) {
        this.operationTime = operationTime;
    }
}
