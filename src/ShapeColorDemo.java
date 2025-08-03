// Interface Shape
interface Shape {
    double calculateArea();
}

// Interface Colorable
interface Colorable {
    void fillColour(String colour);
}

// Class Circle implementing both Shape and Colorable
class Circle implements Shape, Colorable {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Fill color for the circle
    @Override
    public void fillColour(String colour) {
        System.out.println("Filling the circle with color: " + colour);
    }
}

// Class Rectangle implementing both Shape and Colorable
class Rectangle implements Shape, Colorable {
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Fill color for the rectangle
    @Override
    public void fillColour(String colour) {
        System.out.println("Filling the rectangle with color: " + colour);
    }
}

// Main class to demonstrate multiple inheritance using interfaces
public class ShapeColorDemo {
    public static void main(String[] args) {
        // Instantiate Circle object
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        circle.fillColour("Red");

        System.out.println();

        // Instantiate Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        rectangle.fillColour("Blue");
    }
}
