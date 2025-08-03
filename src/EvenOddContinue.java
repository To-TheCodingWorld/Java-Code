import java.util.Scanner;

public class EvenOddContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num=ArrayUtility.inputArray();

        for (int isEven : num){
            if(!(isEven%2==0)){
                continue;
            }
            System.out.println(isEven);
        }
    }
}
