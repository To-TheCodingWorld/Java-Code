import java.util.Scanner;

public class BreakLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the break loop system...\n");

        while (true){
            System.out.print("Enter the command : ");
            String command = sc.next();
            if(command.equals("Exit") ){
                break;
            }
        }
        System.out.println("You have succesfully exited");
    }
}
