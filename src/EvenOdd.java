import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welome to the Even & Odd cheker....");
        System.out.print("Please enter the numbers :");
        int Num = sc.nextInt();

        if (Num%2==0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is Odd");
    }
}
