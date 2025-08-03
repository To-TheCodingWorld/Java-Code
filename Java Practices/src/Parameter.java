public class Parameter {
    public static void main(String[] args) {
//      int num =  sumTwoNo(4,5);
//        System.out.println(num);
        System.out.println(sumTwoNo(4,8));
        System.out.println(sumTwoNo(9,10));
        System.out.println(sumTwoNo(15,58888));
    }

    public static int sumTwoNo(int a , int b){
        System.out.println("First no is : " +a);
        System.out.println("Second no is : " +b);
        int Sum = a+b;
        return Sum;
    }
}
