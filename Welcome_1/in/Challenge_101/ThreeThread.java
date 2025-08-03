package in.Challenge_101;

public class ThreeThread extends Thread{

   public int ThreadNumber;

    public ThreeThread(int ThreadNumber) {
        this.ThreadNumber=ThreadNumber;
    }

    public void run(){
        System.out.printf("%s Thread Starting - %d\n",Thread.currentThread().getName(),ThreadNumber );

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.printf("%s Thread Ended - %d\n",Thread.currentThread().getName(),ThreadNumber);
    }
}
