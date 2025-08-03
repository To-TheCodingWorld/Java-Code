import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the factorial calculator ....\n");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        long Result = FactOfNo(num);
        System.out.println("The factorial is : " +Result);
    }

    public static int FactOfNo(int num){
        int i=1;
        int sum =1;
        while(i<=num){
           sum = sum*i;
            i++;
        }
        return sum;
    }
}