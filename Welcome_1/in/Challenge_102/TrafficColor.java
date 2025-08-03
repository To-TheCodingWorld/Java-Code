package in.Challenge_102;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    public final int onTimeINMills;

    TrafficColor (int onTimeINMills){
        this.onTimeINMills= onTimeINMills;
    }
}
