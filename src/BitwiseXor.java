import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing the bitwise XOR operator ...\n");
        System.out.print("Please enter your first number : ");
        int first = sc.nextInt();
        System.out.print("Now.Enter your second number : ");
        int second = sc.nextInt();

        int Result = first ^ second ;
        System.out.println("The Result is : " +Result);
    }
}
