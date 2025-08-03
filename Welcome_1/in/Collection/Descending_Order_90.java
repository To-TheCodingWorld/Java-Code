package in.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Descending_Order_90 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rabi","Ram","Laxman","Bharat");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

    }

    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList);
        Collections.reverse(stringList);

    }
}
