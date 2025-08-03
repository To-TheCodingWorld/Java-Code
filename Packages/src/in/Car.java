package in;

public class Car {
      private  String color; // I need public access
    private String model;//public
    private double fuel;
    private long CostOfPurchase;// default


    public Car(String color, String model, double fuel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuel = fuel;
        CostOfPurchase = costOfPurchase;
    }

    public  String getColor(){
        return color;
    }

    public  String getModel(){
        return model;
    }
}
