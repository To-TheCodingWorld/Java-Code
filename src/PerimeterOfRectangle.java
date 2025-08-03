import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculation of Perimeter of rectangle...\n");
        System.out.print("Please enter all the sides in cm ;");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();

        System.out.println("The result is : " +(a+b+c+d));
    }
}
