public class Car {
    static  int noOfCarSold;
    int noOfWheels;
    String color;
    float MaxSpeed;
    float CurrentFuel;
    int NoOfseats;

    Car(String color ){
    noOfWheels = 4;
    this.color = color;
    MaxSpeed = 150;
    NoOfseats = 5;
}

static {
        noOfCarSold=56;
    System.out.println("The Car is sold");
}
//    Car(){
//        noOfWheels = 4;
//        this.color = "Black";
//        NoOfseats = 5;
//    }

     Car(){
        this("Green");
        CurrentFuel = 80;
    }

    public Car start(){
        if(CurrentFuel ==0){
            System.out.println("Car is out of fuel,can not start");
        }
        else if(CurrentFuel <5 ) {
            System.out.println("Car is in Researved mode,please refuel");
        }
        else {
            System.out.println("Car is started.....bruhhh");

        }
        return this;
    }

    public void Drive(){
            System.out.println("Car is driving");
            CurrentFuel--;
    }

    public void addFuel(float fuel){
        CurrentFuel+=fuel;
    }
    public float getCurrentFuelLevel(){
        return CurrentFuel;
    }
}
