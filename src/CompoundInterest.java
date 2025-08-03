import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the compound Interest ..\n");
        System.out.print("Enter the principle amount : ");
        int p= sc.nextInt();
        System.out.print("Enter the interest year : ");
        float t= sc.nextFloat();
        System.out.print("Enter the rate of interest : ");
        float r=sc.nextFloat();

        double Interest = p*Math.pow((1+r/100),t);
        System.out.println("Your compound interest is : " +Interest);
    }
}
