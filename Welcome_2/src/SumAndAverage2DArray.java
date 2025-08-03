public class SumAndAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum and Average calculator .....\n");
        int[][] numArray = ArrayUtility.input2DArray();
        int isSum = Sum(numArray);
        System.out.println("The Sum of the array is : " +isSum);
        float isAverage=Average(numArray);
        System.out.print("The Average of the Array is : " +isAverage);
    }

    public static int Sum (int[][] numArray){
        int i=0;
        int Add = 0;
        while (i< numArray.length){
            int j=0;
            while (j< numArray[i].length){
                Add+=numArray[i][j];
                j++;
            }
          i++;
        }
        return Add;
    }

    public static float Average(int[][] numArray){
        if(numArray.length==0){
            return  0;
        }
        int rows= numArray.length;
        int cols = numArray[0].length;
        int Avg = Sum(numArray);
        int Result = rows * cols;
        return (float) Avg/Result;
    }
}
