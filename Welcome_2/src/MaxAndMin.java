public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println("Welcome to the Max and Min Calculation....\n");
        int[] numArr = ArrayUtility.inputArray();
        int Result = MaxNo(numArr);
        System.out.println("The Max no is : " +Result);
        int Result1 = MinNo(numArr);
        System.out.println("The Min no is : " +Result1);
    }

    public static int MaxNo(int[] numArr){
        int i=1;
        int Max = numArr[0];
        while(i<numArr.length){
            if(Max<numArr[i]){
                Max=numArr[i];
            }
            i++;
        }
        return Max;
    }


    public static int MinNo(int[] numArr){
        int i=1;
        int Min=numArr[0];
        while (i< numArr.length){
            if(Min>numArr[i]){
                Min=numArr[i];
            }
            i++;
        }
        return Min;
    }

}
