package in.kgcoding.inheritance;

public class Twowheeler extends Vehicle{

    Twowheeler(){
        setNumberOfTyres(2);
    }
    public void balance(){
        System.out.println("I am balancing two tyres");
    }

}
