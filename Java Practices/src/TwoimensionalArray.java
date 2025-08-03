public class TwoimensionalArray {
    public static void main(String[] args) {

//        int [][] myArr = new int[2][3];
//        myArr[0][0] = 10;
//
        int[][] arr = {{1,2,3},{4,6,3},{1,5,6}};
//        System.out.println(arr.length);


        //Traversal
        int i=0;
        while(i<arr.length){
            int j= 0;
            while(j<arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
