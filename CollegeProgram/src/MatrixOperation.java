//Implement matrix sum, diagonal sum and matrix multiplication using a 5 x 5 multi
//dimensional arrays.


public class MatrixOperation {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] matrix2 = {
                {5, 4, 3, 2, 1},
                {10, 9, 8, 7, 6},
                {15, 14, 13, 12, 11},
                {20, 19, 18, 17, 16},
                {25, 24, 23, 22, 21}
        };

        int[][] resultSum = new int[5][5];

        // Perform matrix sum
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                resultSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Matrix Sum:");
        for (int[] row : resultSum) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

