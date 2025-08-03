public class LeftHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pyramid Printer.....\n");
        isLeftPyramid();

    }

    public static void isLeftPyramid(){
        int row =0;
        while(row<=5){
            int j = 5;
            while (j>row) {
                System.out.print("  ");
                j--;
            }
            int i=0;
            while (i<row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
