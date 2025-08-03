//Create a class in java to input a number and find out its type among Prime, Odd or Even,
//        Special, Armstrong, Perfect and Palindrome using functions.

import java.util.Scanner;
public class NumberTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        NumberTypeChecker checker = new NumberTypeChecker();

        // Check and display the type of the number
        System.out.println("Is Prime: " + checker.isPrime(number));
        System.out.println("Is Odd: " + checker.isOdd(number));
        System.out.println("Is Even: " + checker.isEven(number));
        System.out.println("Is Special: " + checker.isSpecial(number));
        System.out.println("Is Armstrong: " + checker.isArmstrong(number));
        System.out.println("Is Perfect: " + checker.isPerfect(number));
        System.out.println("Is Palindrome: " + checker.isPalindrome(number));

        scanner.close();
    }

    // Check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Check if a number is odd
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Check if a number is special (example definition: sum of digits is equal to 1)
    public boolean isSpecial(int number) {
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits == 1;
    }

    // Check if a number is Armstrong
    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Check if a number is perfect
    public boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Check if a number is a palindrome
    public boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}

