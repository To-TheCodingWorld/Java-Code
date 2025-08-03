//     iv) 1/11 - 11/111 + 111/1111 – 1111/11111……….n terms
import java.util.Scanner;

public class SeriesSumFactorial_111 {

    // Method to generate the denominator for the series
    public static long generateDenominator(int n) {
        long value = 1;
        for (int i = 0; i < n; i++) {
            value = value * 10 + 1;
        }
        return value;
    }

    // Method to calculate the sum of the series 1/11 - 11/111 + 111/1111 - 1111/11111 ... n terms
    public static double calculateSeriesSum(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            long numerator = generateDenominator(i);
            long denominator = generateDenominator(i + 1);
            double term = (double) numerator / denominator;

            // Alternating addition and subtraction
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }
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

