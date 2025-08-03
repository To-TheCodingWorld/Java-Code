public class RightHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pyramid printer...\n");
        isRightHalfPyramid();


    }

    public static void isRightHalfPyramid(){
        int rows = 0;
        while(rows<=4){
            System.out.print("*");
            int i=4;
            while(i>rows){
                System.out.print(" *");
                i--;
            }
            System.out.println();
            rows++;
        }

    }
}
