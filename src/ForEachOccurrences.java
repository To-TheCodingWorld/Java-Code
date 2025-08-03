import java.util.Scanner;

public class ForEachOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the finding occurrences..\n");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to search:");
        int element = sc.nextInt();


        int Result= isOccurrences(arr,element);
        System.out.print("The occurrences is : " + Result);

    }

    public static int isOccurrences(int[] arr , int element){
        int count =0;
        for (int num : arr){
            if (num==element){
                 count =count+1;
            }
        }
        return count;
    }
}
