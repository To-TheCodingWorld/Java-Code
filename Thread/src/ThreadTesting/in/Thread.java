package ThreadTesting.in;

public class Thread {
    public static void main(String[] args) {
        Long First = System.currentTimeMillis();
        System.out.println(First);

        for(int i =1;i<=1000;i++){
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task complete");

        for(int i =1;i<=1000;i++){
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task complete");
        for(int i =1;i<=1000;i++){
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task complete");

        Long End = System.currentTimeMillis();
        System.out.println(End);
        System.out.printf("Total time taken : %d ",(End-First));
    }


}
