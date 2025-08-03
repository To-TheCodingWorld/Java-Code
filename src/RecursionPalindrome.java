import java.util.Scanner;

public class RecursionPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the palindrome checker\n");
        System.out.print("Enter the palindrome:"  );
        String PP = sc.next();

        System.out.println("your string is " +((isPalindrome(PP)?"palindrome":"not palindrome")));

    }

    public static boolean isPalindrome(String PP){
        if(PP.length()<=1){
            return true;
        }
        int LastPos=PP.length()-1;
        if(PP.charAt(0) != PP.charAt(LastPos)){
            return false;
        }
        String newStr=PP.substring(1,LastPos);
        return isPalindrome(newStr);
    }
}
