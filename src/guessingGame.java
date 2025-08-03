import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game..\n");
        int num;
        int Guess = 555;
        do {
            System.out.println("Enter the number: ");
            num = sc.nextInt();
        }while(!(num==Guess));
        System.out.println("The number is guessed");
    }
}
