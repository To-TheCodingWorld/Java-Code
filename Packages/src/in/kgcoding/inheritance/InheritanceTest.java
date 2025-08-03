package in.kgcoding.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        Twowheeler two = new Twowheeler();
        two.commute();

        MotorCycle motor =new MotorCycle();

        motor.commute();
        two.balance();
        motor.balance();
        motor.start();

    }
}
