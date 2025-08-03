public class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome checker.....\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if(isPalin)
            System.out.println("The Array is palindrome");
        else
            System.out.println("The Array is not palindrome");
    }

    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while(i< numArr.length/2){
            if (numArr[i] != numArr[(numArr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
