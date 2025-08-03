package Synchronize.in;

public class SynchronizedThread  extends Thread{
    private Counter check;

    public SynchronizedThread(Counter check) {
        this.check = check;
    }

    public void run(){
        for(int i=1;i<=100;i++){
            check.Increment();
        }
    }
}
