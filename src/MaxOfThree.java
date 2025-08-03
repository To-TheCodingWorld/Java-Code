import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Maximum of Three Numbers\n");
        System.out.print(" Enter Three Numbers  :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && b>c)
            System.out.println("Max is : " +a);
        else if (b>c && c>a)
            System.out.println("Max is : " +b);
        else
            System.out.println("Max is : " +c);
    }
}
