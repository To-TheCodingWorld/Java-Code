public class ForEachMaxValue {
    public static void main(String[] args) {
        System.out.println("Welcome to the finding the maximum..\n");
        int[] arr = ArrayUtility.inputArray();
        int Max = Integer.MIN_VALUE;
        for (int num: arr){
//            System.out.println("No of value used: " +num);
            if(Max<num){
                Max=num;
            }
        }
        System.out.println("Maximum number is : "+Max);
    }
}
