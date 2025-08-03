import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Prime checker....\n");
        System.out.println("Please Enter the number : ");
        int num = input.nextInt();

        boolean prime=primeNo(num);
       if (prime) {
           System.out.println("Your number is prime");
       }
       else {
           System.out.println("Your number is not prime");
       }
    }

    public static boolean primeNo(int num)
    {
        int i=2;
        int prr=0;
        while(i<num){
            if(num % i == 0){
                prr=i;
                return false;
            }
            i++;
        }
        return true;
    }
}