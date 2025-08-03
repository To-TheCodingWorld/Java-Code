public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and Average....\n");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        long avg = Average(numArray);
        System.out.println("The sum of the number is : " +sum);
        System.out.println("The average of the number is : " +avg);
    }

    public static long sum(int[] numArray){
        int i=0;
        long sum=0;
        while(i< numArray.length){
            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static long Average (int[] numArray){
        long Average = sum(numArray);
        long Result = Average/ numArray.length;
        return Result;
    }
}