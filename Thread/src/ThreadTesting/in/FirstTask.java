package ThreadTesting.in;

public class FirstTask extends Thread{
    public void run(){
        for(int i =1;i<=1000;i++){
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task complete");

    }


    public void start() {

    }
}
