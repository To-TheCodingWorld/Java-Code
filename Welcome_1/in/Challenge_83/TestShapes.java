package in.Challenge_83;

public class TestShapes {
    public static void main(String[] args) {
//        Shape shape = new Shape();
        Circle circle = new Circle(5);
        Square square = new Square(10.5);
        System.out.printf("Circle area is : %.2f",circle.calulateArea());
        System.out.printf("\nSquare area is : %.2f",square.calulateArea());


    }
}
