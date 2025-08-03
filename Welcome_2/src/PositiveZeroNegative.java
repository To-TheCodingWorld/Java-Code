import java.util.Scanner;

public class PositiveZeroNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the number Checker....\n");
        System.out.print("Please enter your number : ");
        int Num = sc.nextInt();

        if(Num>0)
            System.out.println("Positive Numbber");
        else if (Num==0)
            System.out.println("The value is Zero");
        else
            System.out.println("Negative Number");
    }
}
