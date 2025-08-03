import java.util.Scanner;

public class FloatMultification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are doing float Multification...\n");
        System.out.println("Enter the first number : ");
        double first= sc.nextDouble();
        System.out.println("Enter the second number : ");
        double second = sc.nextDouble();

        System.out.println("The result  is : " +(first*second));
    }
}
