public class Drive {

    public static void main(String[] args) {
//        Car myCar = new Car();
//
//        myCar.addFuel(100);
//        myCar.Drive();
//        myCar.Drive();
//        myCar.Drive();
//        myCar.Drive();
//        System.out.println( myCar.getCurrentFuelLevel());

        Car Swift = new  Car("Red");
        Car Thar = new Car();
        System.out.println( "The Color of thar is : "+Thar.color);
        System.out.println(Thar.MaxSpeed);
        System.out.println(Thar.color);
//        Swift.addFuel(20);
//        Swift.start();
//        Swift.Drive();
        Swift.start().Drive();
        System.out.println("This is my car color : " + Swift.color);
        System.out.println(Swift.noOfWheels);
        System.out.println(Swift.color);
//        System.out.println(Swift.getCurrentFuelLevel());
    }
}