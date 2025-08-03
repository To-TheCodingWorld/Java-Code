import java.util.Scanner;

public class NumberGuessing {

    int roll(){
        double random = Math.random()*10;
        int correct = (int)Math.ceil(random);
        return correct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game ...\n");

        NumberGuessing guessing = new NumberGuessing();
        int NewNum = guessing.roll();
        for(int i = 0; i<15;i++){
            System.out.print("Enter your guessing number between 1 to 10 : ");
            int num = sc.nextInt();
            if(num == NewNum) {
                System.out.println("The number is guessed");
            }
        }
    }
}
