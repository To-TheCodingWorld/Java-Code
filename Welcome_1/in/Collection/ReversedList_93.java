package in.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedList_93 {
    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(List);
        Collections.reverse(List);
        System.out.println(List);
    }
}
