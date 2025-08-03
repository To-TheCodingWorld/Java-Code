import java.util.Scanner;

class Shape {
    private double length;
    private double width;
    private double radius;

    // Constructor for square
    public Shape(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor for rectangle
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor for circle
    public Shape(double radius, boolean isCircle) {
        if (isCircle) {
            this.radius = radius;
        }
    }

    // Method to calculate the area
    public double calculateArea() {
        if (radius != 0) {
            return Math.PI * radius * radius; // Area of circle
        } else {
            return length * width; // Area of square or rectangle
        }
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        if (radius != 0) {
            return 2 * Math.PI * radius; // Perimeter of circle
        } else if (length == width) {
            return 4 * length; // Perimeter of square
        } else {
            return 2 * (length + width); // Perimeter of rectangle
        }
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        int choice = scanner.nextInt();

        Shape shape;

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                shape = new Shape(side);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Shape(length, width);
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Shape(radius, true);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                scanner.close();
                return;
        }

        double area = shape.calculateArea();
        double perimeter = shape.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}
