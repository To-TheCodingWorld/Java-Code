import java.util.Scanner;

class Arithmetic {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to the Arithmetic Calculator...\n");
         System.out.print("Please enter 1st no : ");
         int x = sc.nextInt();
         System.out.print("Now,Enter 2nd no : ");
         int y = sc.nextInt();

         int add = x+y;
         int sub=x-y;
         int mul = x*y;
         int div = x/y;
         int mod = x%y;
         System.out.println("\n\n");
         System.out.println("The addition is :" +add);
         System.out.println("The substraction is :" +sub);
         System.out.println("The Multification is : " +mul);
         System.out.println("The Division is :" +div);
         System.out.println("The Modulus is : " +mod);
     }
}
