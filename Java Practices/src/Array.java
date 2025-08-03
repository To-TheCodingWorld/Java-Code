public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
////        myArr[0]=90;
////        myArr[1]=95;
////        myArr[2]=92;
////        myArr[3]=44;
////        myArr[4]=77;

        int[] myArr = {98,25,30,44,23};
//        int index =2;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[4]);

        int index = 0;
        while(index<myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
    }
}
