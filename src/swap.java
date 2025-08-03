import java.util.Scanner;

class swap {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to the swapping staton ......");
         System.out.print("Enter the value of A : ");
         int a = sc.nextInt();
         System.out.print("Enetr the value of B : ");
         int b = sc.nextInt();

         int c=a;
         a=b;
         b=c;

         System.out.println("Swapping Done...");
         System.out.println("The value of A is : " +a);
         System.out.println("The value of B is : " +b);

     }
}
