package BitlabAcademy.Files.task1Dauren;

public class Operation extends Thread{
    private String operationName;
    private int operationTime;

    public Operation(String operationName, int operationTime){
        this.operationName = operationName;
        this.operationTime = operationTime;
    }
    public void run(){
        try
        {
            for(int i = 0; i < operationTime; i ++)
            {
                System.out.println("Operation " + operationName + " is working: " + i + " seconds");
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Operation " + operationName + " is finished");
    }
}


