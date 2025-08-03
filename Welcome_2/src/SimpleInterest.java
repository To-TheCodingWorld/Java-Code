import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the simple calculator ..\n");
        System.out.print("Enter the principle amount :");
        int p= sc.nextInt();
        System.out.print("Enter the year :");
        float t= sc.nextFloat();
        System.out.print("Enter the rate of interest : ");
        float r=sc.nextFloat();

        float Result = (p*r*t)/100;
        System.out.println("The simple interest is : " +Result);

    }
}
