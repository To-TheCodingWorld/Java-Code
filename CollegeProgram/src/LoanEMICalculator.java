//Calculate the EMI to pay off a loan at a given interest rate compounded continuously by
//        considering number of years(t), the Principal (P) and the rate of interest(r) from the
//        user.


import java.util.Scanner;

public class LoanEMICalculator {

    // Method to calculate EMI for continuous compounding
    public static double calculateEMI(double principal, double rate, int years) {
        double amount = principal * Math.exp(rate * years);
        double emi = amount / (years * 12); // Divide by total number of months
        return emi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (r) as a decimal (e.g., 0.05 for 5%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years (t): ");
        int years = scanner.nextInt();

        if (principal <= 0 || rate < 0 || years <= 0) {
            System.out.println("Please enter positive values for principal, rate, and years.");
        } else {
            double emi = calculateEMI(principal, rate, years);
            System.out.printf("The monthly EMI for the loan is: %.2f%n", emi);
        }

        scanner.close();
    }
}
