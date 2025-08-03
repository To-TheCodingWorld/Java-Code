package in.Thread;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Print_Thread_99 t1= new Print_Thread_99(1);
        Print_Thread_99 t2= new Print_Thread_99(2);

        t1.start();
        t2.start();

    }
}
