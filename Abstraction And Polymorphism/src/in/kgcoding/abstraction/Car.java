package in.kgcoding.abstraction;

public  class Car extends  Vehicle{
    private int noOfdoors;

    public Car(){
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Bruhhh");
    }

    public void start(){
        super.start();
        System.out.println("Car is starting...");
    }
}
