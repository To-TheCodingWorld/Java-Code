import java.util.Scanner;
import java.util.Arrays;

public class CyclicPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform 4 cyclic permutations
        System.out.println("Original Array: " + Arrays.toString(array));
        for (int i = 1; i <= 4; i++) {
            array = cyclicPermute(array);
            System.out.println("Cycle " + i + ": " + Arrays.toString(array));
        }

        scanner.close();
    }

    // Function to cyclically permute the array
    private static int[] cyclicPermute(int[] array) {
        int size = array.length;
        int[] newArray = new int[size];

        //Move each element to the right, and the last element to the first position
        newArray[0] = array[size - 1];
        for (int i = 1; i < size; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }
}

