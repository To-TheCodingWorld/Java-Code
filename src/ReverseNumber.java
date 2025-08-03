import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to the Reverse number checker  .....\n");
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int reverse = isReverse(num);
        System.out.println("The reverse number is : "+reverse);
    }

    public static int isReverse(int num){
        int i=0;
        int sum=0;
        while (num>0) {
            i = num % 10;
            sum = sum * 10 + i;
            num = num / 10;
        }
        return sum;
    }
}
