//           iii) 1+ 2!/3! – 3!/4! + 4!/5! – 5!/6!.......n terms


import java.util.Scanner;

public class SeriesSumFactorial {

    // Method to calculate the factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate the sum of the series 1 + 2!/3! - 3!/4! + 4!/5! - ... n terms
    public static double calculateSeriesSum(int n) {
        double sum = 1.0; // First term is 1

        for (int i = 2; i <= n; i++) {
            double term = (double) factorial(i) / factorial(i + 1);
            if (i % 2 == 0) {
                sum += term; // Add for even indices
            } else {
                sum -= term; // Subtract for odd indices
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

