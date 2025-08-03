import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to driving licence....\n");
        System.out.print("Enter Your age : ");
        int age = sc.nextInt();

        if(age>=18 && age<=59)
            System.out.println("You are Eligible.");
        else if (age>=60)
            System.out.println("Please ...take rest.");
        else
            System.out.println("please ,drive cycle.");
    }
}
