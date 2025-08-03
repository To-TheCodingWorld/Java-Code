import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator...\n");
        System.out.print("Please enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Please enter Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator : ");
        char Ch = sc.next().charAt(0);

        isCal(num1,num2,Ch);
    }


    public  static  void isCal(int num1,int num2,char Ch){
         switch (Ch) {
            case '+' :
                System.out.println("The Result is : "+(num1+num2));
                break;
            case '-' :
                System.out.println("The Result is : "+(num1-num2));
                break;
            case '*' :
                System.out.println("The Result is : "+(num1*num2));
                break;
            case '/' :
                System.out.println("The Result is : "+(float)(num1/num2));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
