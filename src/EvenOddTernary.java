import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Even Odd Checker...\n");
        System.out.print("Please enter the number : ");
        int num = sc.nextInt();

        EvenOddTernary Ternary = new EvenOddTernary();
        boolean Result = Ternary.EvenOdd(num);
        if(Result)
            System.out.print(" The number is Even ");
        else System.out.print(" The number is Odd ");
    }

    public static boolean EvenOdd(int num){
        return num%2==0? true : false;
    }
}
