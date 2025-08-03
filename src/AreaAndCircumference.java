import java.util.Scanner;

public class AreaAndCircumference {

    final static double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Area and Perimeter calculation...\n");
        System.out.println("Enter the radius of the circle : ");
        int radius = sc.nextInt();

        double Circle_Area = isArea(radius);
        System.out.println("The area of the circle is : " + Circle_Area);

        double Circle_Perimeter = isCircum(radius);
        System.out.println("The Perimeter of the circle is : "+Circle_Perimeter);
    }

    public static double isArea(int radius){
        double Area = PI*radius*radius;
        return Area;
    }

    public static double isCircum(int radius){
        double Circum = 2*PI*radius;
        return Circum;
    }

}
