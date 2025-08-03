import java.util.Scanner;

public class ArrayUtility
{
    public static int[] inputArray()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the numbers of elements : ");
        int size = input.nextInt();
        int[] num = new int[size];

        int i=0;
        while(i<size)
        {
            System.out.print("Please enter the element no " +(i+1)+ " : ");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the numbers of rows : ");
        int rows = input.nextInt();
        System.out.print("Please enter the numbers of columns : ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        int j=0;
        for (i=0;i<rows;i++) {
            for (j=0;j<columns;j++){
                System.out.print("Please enter the element  of rows : " +(i+1)+ ", column : " +(j+1)+ " : ");
                numArray[i][j] = input.nextInt();
            }
        }
        return numArray;
    }

    public static void displayArray(int[] numArray){
        int i=0;
        while(i<numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
    }
}
