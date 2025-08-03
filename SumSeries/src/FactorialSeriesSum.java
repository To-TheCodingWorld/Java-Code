//   i) 1 + 1/2! + 1/3! + 1/4! +………+ 1/n!

import java.util.Scanner;

public class FactorialSeriesSum {

    // Method to calculate factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate the sum of the series
    public static double calculateSeriesSum(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / factorial(i);
        }

        // Adding the first term of the series (1)
        return 1 + sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the value of n: ");
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