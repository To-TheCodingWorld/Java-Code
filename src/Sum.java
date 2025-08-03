import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the calculator....");
        System.out.print("Enter the 1st number : ");
        int x=sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int y= sc.nextInt();
        int z=x+y;
        System.out.println("The Sum is : " + z);
    }
}
