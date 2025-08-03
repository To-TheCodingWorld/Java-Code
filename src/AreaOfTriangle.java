import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Triangle calculator....\n");
        System.out.print("Enter the breadth of the triangle : ");
        double breadth = sc.nextDouble();
        System.out.print("Enter the width of the triangle : ");
        double width = sc.nextDouble();

        double Res = (breadth * width)/2;
        System.out.println("The Area of triangle is : " + Res + " cm2");
    }
}
