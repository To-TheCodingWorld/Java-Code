//Input Basic Salary from the user and calculate Gross Salary and Net Salary of a person
//        after considering the given conditions:
//        Where,
//        DA=95% of Basic Salary
//        HRA=15% of Basic Salary
//        PF=12% of Basic Salary if Salary is less than or equal to 15000.00 else 2100.00
//        PTax=200.00
//        Gross Salary= Basic Salary + DA + HRA
//        Net Salary = Gross Salary – PF – Ptax


import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Basic Salary from the user
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate DA (95% of Basic Salary)
        double DA = 0.95 * basicSalary;

        // Calculate HRA (15% of Basic Salary)
        double HRA = 0.15 * basicSalary;

        // Calculate PF (12% of Basic Salary if <= 15000.00 else 2100.00)
        double PF;
        if (basicSalary <= 15000.00) {
            PF = 0.12 * basicSalary;
        } else {
            PF = 2100.00;
        }

        // Professional Tax
        double PTax = 200.00;

        // Calculate Gross Salary
        double grossSalary = basicSalary + DA + HRA;

        // Calculate Net Salary
        double netSalary = grossSalary - PF - PTax;

        // Display results
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}

