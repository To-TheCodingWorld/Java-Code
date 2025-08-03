package ThreadPractise.in;

public class ThreadResult {
    public static void main(String[] args) {
        Long Start = System.currentTimeMillis();
        MyThread t1=new MyThread();
        MyThread_2 t2= new MyThread_2();
        t1.start();
        t2.start();

        Long End = System.currentTimeMillis();
        System.out.printf("Time Taken : %d",(Start-End));
    }
}
