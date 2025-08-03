import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the factorial Generator...\n");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        long Result = Fact(num);
        System.out.println("The Factorial is : "+Result);

        long Result1 = factorial(num);
        System.out.println("Recursion factorial is : "+Result1);
    }

    public static long factorial(int num){
        System.out.println("Function called for : "+num);
        if (num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static long Fact(int num){
        int Sum=1;
        for(int i=1;i<=num ; i++){
            Sum = Sum*i;
        }
        return Sum;
    }
}
