import java.util.Scanner;

public class FloatOrderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three float values as input from the user
        System.out.print("Enter first float value: ");
        float a = scanner.nextFloat();
        System.out.print("Enter second float value: ");
        float b = scanner.nextFloat();
        System.out.print("Enter third float value: ");
        float c = scanner.nextFloat();

        // Check the order
        if (a < b && b < c) {
            System.out.println("The three float values are in Ascending order");
        } else if (a > b && b > c) {
            System.out.println("The three float values are in Descending order");
        } else {
            System.out.println("The three float values are in Neither ascending nor descending order");
        }

        scanner.close();
    }
}

