package in.Collection;

import java.util.Arrays;
import java.util.List;

public class Swap_Num_92 {
    public static void main(String[] args) {
        List<Integer> Num = Arrays.asList(7,8,9,20,33,22);
        Swap(Num,3,4);
        System.out.println(Num);
    }

    public static void Swap(List<Integer> ArrNum ,int x, int y){
        int swap=ArrNum.get(x);
        ArrNum.set(x, ArrNum.get(y));
        ArrNum.set(y,swap);

    }
}
