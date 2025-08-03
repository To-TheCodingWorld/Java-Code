import java.util.Scanner;

public class PositiveNoContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the positive number addition ....\n");
        int[] Positive = ArrayUtility.inputArray();

        int Sum=0;
        for (int num: Positive){
            if (num<0){
                continue;
            }
            Sum= Sum + num ;
        }
        System.out.println("The sum of Positive number is : " +Sum);
    }
}
