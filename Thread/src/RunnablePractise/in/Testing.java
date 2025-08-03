package RunnablePractise.in;

public class Testing {
    public static void main(String... args) {
        Long Start = System.currentTimeMillis();

        MyTask_1 p1= new MyTask_1();
        MyTask_2 p2 = new MyTask_2();


        Thread t1= new Thread(p1);
        Thread t2 = new Thread(p2);
        t2.setPriority(10);
        t1.setPriority(1);
        t1.start();
        t2.start();

//        t2.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.NORM_PRIORITY);

        t2.setName("Thread 1");


        Long End = System.currentTimeMillis();
        System.out.printf("Time Taken : %d ",(End-Start));
    }
}
