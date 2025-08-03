import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the age checker : \n");
        System.out.print("Please Enter your age : ");
        int age = sc.nextInt();

        if(age>=60)
            System.out.println("you are senior citizen");
        else if(age>=20)
            System.out.println("You are Adult");
        else if(age>=13)
            System.out.println("You are teenager");
        else
            System.out.println("you are child");
    }
}
