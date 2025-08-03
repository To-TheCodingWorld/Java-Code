package in.Challenge_83;

public class Square extends Shape {
    public final double Side;


    public Square(double Side){
        this.Side=Side;
    }


    @Override
    public double calulateArea() {
        return Math.pow(Side,2);
    }
}
