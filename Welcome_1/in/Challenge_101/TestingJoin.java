package in.Challenge_101;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        ThreeThread t1=new ThreeThread(1);
        ThreeThread t2=new ThreeThread(2);
        ThreeThread t3=new ThreeThread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
