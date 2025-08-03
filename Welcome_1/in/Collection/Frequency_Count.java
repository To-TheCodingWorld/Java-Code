package in.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency_Count {
    public static void main(String[] args) {
        List<Integer> Num = Arrays.asList(1,2,34,6,73,3,3,7,4,1,1,1,1,3,3,3);
        Count(Num);

    }

    public static void Count(List<Integer> ArrNum){
        System.out.println(Collections.frequency(ArrNum,1));
        System.out.println(Collections.frequency(ArrNum,3));
    }
}
