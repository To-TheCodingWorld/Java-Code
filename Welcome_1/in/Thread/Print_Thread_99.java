package in.Thread;

public class Print_Thread_99 extends Thread{
    private final int threadNo;

    public Print_Thread_99(int threadNo){
        this.threadNo=threadNo;
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.printf("(%d)Hello from Thread- %d\n ",(i+1),threadNo);
        }
    }
}
