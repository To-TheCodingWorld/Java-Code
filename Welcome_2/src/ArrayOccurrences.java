import java.util.Scanner;

public class ArrayOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array Occurrences...\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find : ");
        int num = input.nextInt();
        int result = Calculation(numArr , num);
        System.out.println("The number is found :  " +result);

    }

    public static int Calculation(int[] numArr , int num){
        int i=0;
        int count =0;
        while (i<numArr.length){
            if(num == numArr[i]){
                count = count+1;
            }
            i++;
        }
        return count;
    }
}
