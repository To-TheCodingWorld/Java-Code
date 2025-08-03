import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the fibonacci series .....\n");
        System.out.print("Please enter the number of the series: ");
        int num = sc.nextInt();
        System.out.println("Here is the result : ");
        printFibonnaci(num);
    }

    public static void printFibonnaci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");

        int first=0 , second=1 ;
        while(first+second<=num){
            int third = first + second;
            System.out.print(" "+third);
            first = second;
            second = third ;
        }
    }
}
