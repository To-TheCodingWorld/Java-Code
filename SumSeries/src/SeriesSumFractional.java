import java.util.Scanner;

public class SeriesSumFractional {

    // Method to calculate the sum of the series
    public static double calculateSeriesSum(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            double result = calculateSeriesSum(n);
            System.out.println("The sum of the series is: " + result);
        }

        scanner.close();
    }
}

