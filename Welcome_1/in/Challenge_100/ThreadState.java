package in.Challenge_100;

public class ThreadState extends  Thread{


    public void run(){
        try{
            Thread.sleep(4000);
            System.out.printf("From inside Run %s\n " ,getState());
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
}
