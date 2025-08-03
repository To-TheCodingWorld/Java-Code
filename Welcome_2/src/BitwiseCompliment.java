import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing the bitwise Compliment operator ...\n");
        System.out.print("Please enter your first number : ");
        int first = sc.nextInt();

        int Result = ~ first;
        System.out.println("The Result is : " +Result);
    }
}
