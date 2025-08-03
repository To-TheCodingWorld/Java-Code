import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the sum of digit calculator ....\n");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        long Result = Digit(num);
        System.out.println("The sum of digit is : " +Result);
    }

    public static int Digit(int num){
        int a=0;
        int sum = 0;
        while(num>0){
            a=num%10;
            sum = sum + a;
            num = num/10;
        }
        return sum;
    }
}
