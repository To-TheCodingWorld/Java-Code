import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the palindrome Checker.....\n");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        boolean Result = isPalindrome(num);
        if(Result)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }

    public static boolean isPalindrome(int num){
        int add = num;
        int i=0 , Sum=0 ;
        while(num>0){
            i=num%10;
            Sum=Sum*10+i;
            num = num /10;
        }
        if(Sum == add )
            return true;
        else
            return false;
    }
}
