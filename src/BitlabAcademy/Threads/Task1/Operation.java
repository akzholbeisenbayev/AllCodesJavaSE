package BitlabAcademy.Threads.Task1;

public class Operation extends Thread{
    private  String operationName;
    private int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }
    public void run(){
        System.out.println("Thread " + operationName + " started");

        try{
            for(int i=0;i<=operationTime;i++){
                System.out.println("Thread "+ operationName +  " " + i + " second");
                Thread.sleep(2000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread "+operationName+" finished");
    }
}