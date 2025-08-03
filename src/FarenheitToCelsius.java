import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the convert Area .....\n");
        System.out.print("Enter the farenhait value : ");
        float F= sc.nextFloat();

        float C=((F-32)*5)/9;
        System.out.println("The conversion value is : " + C + "C");
    }
}
