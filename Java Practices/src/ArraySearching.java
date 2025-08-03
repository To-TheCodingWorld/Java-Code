import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr = {12,15,19,18,20,25,27,31,32,36};
        System.out.println("Welcome to the Array Searching\n");
        System.out.println("Enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound)
            System.out.println("Your number is in the Array");
        else
            System.out.println("Your number is not in the array");
    }


    public static boolean isFound(int[] arr , int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}