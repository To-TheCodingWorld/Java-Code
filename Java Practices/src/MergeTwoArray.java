import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Two The  sorted  Array !");
        int[] arr1 = {22,34,55,22,23};
        int[] arr2 = {34,88,98,66,99};

        int[] Merged = sorted(arr1,arr2);
        System.out.println("Your Merged array is : "+Merged);
    }


    public static int[] sorted(int[] arr1, int[] arr2)
    {
        int newsize= arr1.length+ arr2.length;
        int[] newarr = new int[newsize];
        int i=0,j=0,k=0;
        while(i< arr1.length || j< arr2.length)
        {
            if ((j==arr2.length) || (i<arr1.length && arr1[i]<arr2[j])){
                newarr[k]=arr1[i];
                i++;
                k++;
            }
            else {
                newarr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return  newarr;
    }
}

