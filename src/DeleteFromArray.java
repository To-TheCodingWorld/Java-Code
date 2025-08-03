import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Array Deletion\n");
        int[] numArr=ArrayUtility.inputArray();
        System.out.print ("Now,Enter the number you want to delete : ");
        int numToDelete = sc.nextInt();
        int[] newArr=deleteNumber(numArr,numToDelete);
        System.out.print("Here is the new Array : ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr,int numToDelete){
        int occ = ArrayOccurrences.Calculation(numArr,numToDelete);
        if(occ==0){
            return numArr;
        }
        int newSize =numArr.length - occ;
        int[] newArr = new int[newSize];

        int i=0,j=0;
        while (i<numArr.length){
            if (numArr[i]!=numToDelete){
                newArr[j]=numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
