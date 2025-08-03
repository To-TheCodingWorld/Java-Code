import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Ticket discount Calculator...\n");
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Are you Female(true/false) :");
        boolean Women = sc.nextBoolean();
        System.out.print("Are you child(true/false) :");
        boolean child = sc.nextBoolean();



        if( age<=5 && child)
            System.out.println("You have got 75% discount.");
        else if (age>=6 && Women)
            System.out.println("You have  got 50% discount. ");
        else if (age>=60)
            System.out.println("You have got 25% any discount");
        else
            System.out.println("You have got no discount");
    }
}