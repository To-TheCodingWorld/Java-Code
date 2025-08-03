package in.Challenge_102;

public class TrafficLight extends Thread{
    private final TrafficColor color;

    public TrafficLight(TrafficColor color) {
        this.color = color;
    }

    public void run(){
        System.out.printf("%s : Active \n ",color);
        try {
            Thread.sleep(color.onTimeINMills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s : Inactive \n",color);
    }
}
