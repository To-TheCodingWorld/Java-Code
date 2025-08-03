import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String Name=sc.nextLine();
        System.out.println("Welcome " + Name + " to The Java Programming.");
    }
}