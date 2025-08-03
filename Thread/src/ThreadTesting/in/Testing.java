package ThreadTesting.in;

public class Testing extends Thread {
    public static void main(String[] args) {
        Long First = System.currentTimeMillis();
        FirstTask t1= new FirstTask();
        SecondTask t2= new SecondTask();
        ThirdTask t3= new ThirdTask();

        t1.start();
        t2.start();
        t3.start();


        Long End = System.currentTimeMillis();
        System.out.printf("Total time taken : %d \n",(End-First));

    }
}
