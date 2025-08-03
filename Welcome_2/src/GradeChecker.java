import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the grade checking...\n");
        System.out.print("Enter the percentage : ");
        int percent = sc.nextInt();

        if(percent>=90)
            System.out.println("You have got A");
        else if(percent>=75)
            System.out.println("You have got B");
        else if(percent>=60)
            System.out.println("You have got C");
        else if(percent>30)
            System.out.println("You have Got D");
        else
            System.out.println("You have got E");
    }
}
