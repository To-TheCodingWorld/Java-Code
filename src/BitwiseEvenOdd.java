import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Even/Odd Calculator ...\n");
        System.out.print("Please , Enter your number : ");
        int Num = sc.nextInt();

        if((Num & 1)==1)
            System.out.println("The number is ODD");
        else
            System.out.println("The Number is Even");
    }
}
