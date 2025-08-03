import java.util.Scanner;

public class ForLoopPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the prime number checker \n");
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        boolean Result= isPrime(num);
        if (Result)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    }

    public static boolean isPrime(int num){
        int i;
        for (i=2;i<=num;i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
}
