//        1
//        121
//        12321
//        1234321
//        123454321
//        1234321
//        12321
//        121
//        1

public class StructureOne {
    public static void main(String[] args) {
        int n = 5;  // Number of lines in the upper half including the middle line

        for (int i = 1; i <= n; i++) {
            printLine(i, n);
        }
        for (int i = n - 1; i >= 1; i--) {
            printLine(i, n);
        }
    }

    private static void printLine(int i, int n) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    }
}


