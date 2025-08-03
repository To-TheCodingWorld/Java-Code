import java.util.Scanner;

public class SumofOddNo {
    public static void main(String[] args) {
        greeting();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int num = input.nextInt();
        int Result = OddSum(num);
        System.out.println("Oddsum till " +num+ " is : " +Result);
    }

    public static int OddSum(int num){
        int i = 1;
        int Sum=0;
        while (i<=num){
            Sum+=i;
            i+=2;
        }
        return Sum;

    }

    public static void greeting(){
        System.out.println("Welcome to the addition of ODD numbers...\n");
    }
}
