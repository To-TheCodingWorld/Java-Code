package Testing;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleep");
        Thread.sleep(500);
        System.out.println("Woke Up");
    }
}
