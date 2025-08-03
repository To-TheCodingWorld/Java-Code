public class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sorted Array...\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = increment(numArr);
        boolean isDec = decrement(numArr);
        if ( isDec || isInc)
            System.out.println("The Array is sorted");
        else
            System.out.println("The Array is not sorted");

    }

    public static boolean increment(int[] numArr){
        int i=1;
        while(i< numArr.length){
            if(numArr[i]<numArr[i-1]){
                return false;
            }
            i++;
        }
        return true ;
    }

    public static boolean decrement(int[] numArr){
        int i = 1;
        while(i< numArr.length){
            if(numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
