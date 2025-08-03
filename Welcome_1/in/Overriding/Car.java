package in.Overriding;

public class Car extends Vehicle {    //Sub Class

    public  void Service(){
        super.Service();
        System.out.println("Car is under servicing...\n");
    }


    public static void main(String[] args) {
        Car car= new Car();
        car.Service();



    }
}
