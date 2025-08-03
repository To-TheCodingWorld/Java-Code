import java.util.Scanner;

public class MinNoOfTwoInTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Minimum number checker...\n");
        System.out.print("Please enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("Please enter your second number :");
        int num2 = sc.nextInt();

        MinNoOfTwoInTernary Result = new MinNoOfTwoInTernary();
        int min = Result.MinNo(num1,num2);
        System.out.println("The Minimum number is :  " +min);

//        int MinNo = num2>num1?num1:num2;
//        System.out.print("The minimum no is : " + MinNo);
    }

    public static int MinNo(int num1 , int num2){
        if(num1<num2)
         return num1;
        else
            return num2;
    }
}
