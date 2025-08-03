import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int x = Number() + 1;
        int y = Number() + 5;
        int sum = x + y;
        System.out.println("Sum of the number is : " + sum);
    }

    public static int Number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please ,enter the number  : ");
        int a = sc.nextInt();
        return a;
    }

    public static void greet(){
        System.out.println("Welcome to the Calculator....\n");
    }


}
