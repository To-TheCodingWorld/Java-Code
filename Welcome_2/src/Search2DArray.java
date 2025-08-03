import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2D Search..\n");
        int[][] numArray = ArrayUtility.input2DArray();
        System.out.println("Please enter the number you want to search : ");
        int num = sc.nextInt();
        boolean isSearch = search(numArray,num);
        if (isSearch)
            System.out.println(" The Number is found .");
        else
            System.out.println("The number is not found");
    }


    public static boolean search(int[][] numArray , int num){
        int i =0;
        int Add =num ;
        while(i<numArray.length){
            int j=0;
            while (j<numArray.length){
                if(Add == numArray[i][j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
