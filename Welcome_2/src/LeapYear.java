import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Leap year checker....\n");
        System.out.print("Please enter your year :");
        int year = sc.nextInt();

        if (year%400==0 || (year%4==0 && year%100!=0))
            System.out.println(+year+" is leap year");
        else
            System.out.println(+year+" is not leap year");
    }
}
