import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahr = scanner.nextDouble();
                double cels = (fahr - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + cels);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                break;
        }

        scanner.close();
    }
}

