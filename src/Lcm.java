import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the lcm calculator...\n");
        System.out.print("Please enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        int lcm = LeastNumber(a , b);
        System.out.println("The LCM is : " +lcm);

    }

    public static int LeastNumber(int a , int b){
        int i=1;
        while(i<=b){
            int factor = a * i;
            if(factor% b == 0){
                return factor;
            }
            i++;
        }
        return 0; // Unreachable
    }
}
