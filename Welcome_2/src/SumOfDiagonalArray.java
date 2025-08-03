public class SumOfDiagonalArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum of the diagonal Array....\n");
        int[][] numArray = ArrayUtility.input2DArray();
        int isone = FirstDiagonal(numArray);
        int istwo = SecondDiagonal(numArray);
        System.out.println("The 1st diagonal sum is :" + isone);
        System.out.println("The 2nd diagonal sum is : " + istwo);

        int isResult = FinalDiagonal(numArray);
        System.out.println("The Diagonal sum is : " + isResult);
        System.out.println("\n");

        int AnotherResult = AnotherDiagonalCondition(numArray);
        System.out.println("The sum of diagonal is : " + AnotherResult);

    }

    public static int FirstDiagonal(int[][] numArray) {
        int i = 0;
        int Sum = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (i == j) {
                    Sum += numArray[i][j];
                }
                j++;
            }
            i++;
        }
        return Sum;
    }

    public static int SecondDiagonal(int[][] numArray) {
        int i = 0;
        int Sum1 = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (i + j == (numArray[i].length - 1)) {
                    Sum1 += numArray[i][j];
                }
                j++;
            }
            i++;
        }
        return Sum1;
    }

    public static int FinalDiagonal(int[][] numArray) {
        int result = FirstDiagonal(numArray) + SecondDiagonal(numArray);
        return result;
    }


    public static int AnotherDiagonalCondition(int[][] numArray) {
        int i = 0;
        int Add = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if ((i == j) || (i + j) == (numArray[i].length - 1)) {
                    Add += numArray[i][j];
                }
                j++;
            }
            i++;
        }
        return Add;
    }
}
