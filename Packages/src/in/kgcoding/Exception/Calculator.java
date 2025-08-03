package in.kgcoding.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator.....\n");
        System.out.print("Please enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Please enter 2nd number : ");
        int num2 = sc.nextInt();
        try{
            int Result = num1/num2;
            System.out.println("The result is : "+Result);
        } catch (ArithmeticException exception){
            System.out.println("Divide by zero , enter valid values");
        }

    }
}
