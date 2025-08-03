package in.ArrayOperation_82;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4,5,6});
        ArrayOperations opr1 = new ArrayOperations(new int[]{1,9,3,5,5,6});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        ArrayOperations.Statistics statistics1=opr1.new Statistics();
        System.out.println(statistics.mean());
        System.out.println(statistics1.mean());


    }
}
