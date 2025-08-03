package in.Challenge_102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight Red = new TrafficLight(TrafficColor.RED);
        TrafficLight Yellow = new TrafficLight(TrafficColor.YELLOW);
        TrafficLight Green= new TrafficLight(TrafficColor.GREEN);

        Red.start();
        Red.join();
        Yellow.start();
        Yellow.join();
        Green.start();
        Green.join();
    }
}
