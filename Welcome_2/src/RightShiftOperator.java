import java.util.Scanner;

public class RightShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing the bitwise Right shift operator ...\n");
        System.out.print("Please enter your  number : ");
        int first = sc.nextInt();

        int Result =  first>>1;
        System.out.println("The Result is : " +Result);
    }
}
