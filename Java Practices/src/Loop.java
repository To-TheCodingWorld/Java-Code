import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//       int a=1; // Initialiation
//        while(a<=100) // Conditon
//        {
//            System.out.println(" " + a); //Actual works
//            a+=1; // Increment/Decrement
//        }

//        int count = 500;
//        while(count>=200)
//        {
//            System.out.println(" " +count);
//            count--;
//        }

        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<5)
        {
            System.out.print("Please enter the number : ");
            int num = sc.nextInt();
            System.out.println("The Number is : " +num*2);
            i++;
        }
    }
}
