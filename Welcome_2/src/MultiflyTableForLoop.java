import java.util.Scanner;

public class MultiflyTableForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the multification table....\n");
        System.out.println("Enter the table number : ");
        int x = sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(i+"X"+x+ ":"+(i*x));

        }
    }
}
