import java.util.Scanner;

public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the fibonacci series...\n");
        System.out.println("Enter the number of elements to be printed : ");
        int count  = sc.nextInt();


        int i;
        for (i=1;i<=count;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int position){
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
            return fibonacci(position-1)+fibonacci(position-2);
    }
}
