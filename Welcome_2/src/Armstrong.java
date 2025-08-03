import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the palindrome series....\n");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        isArmstrong(num);

    }

    public static void isArmstrong(int num){
        int i=0;
        int b=num;
        int Sum = 0;

        while (num>0){
            i=num%10;
            Sum = Sum + (i*i*i);
            num=num/10;
        }
        if(Sum==b){
            System.out.println("The Number is armstrong");
        }
        else
            System.out.println("The number is not armstrong");
    }
}
