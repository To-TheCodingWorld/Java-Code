package in.kgcoding;

public class Car {
    public  String color;
    public String model;
    private double fuel;
    private long CostOfPurchase;

    public Car()
    {

    }

    public Car(String color, String model, double fuel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuel = fuel;
        CostOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuel=" + fuel +
                ", CostOfPurchase=" + CostOfPurchase +
                '}';
    }
}
