package in.kgcoding.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> Num = new ArrayList<>();
        Collections.addAll(Num,56,56,25,65,56,55);
        Collections.sort(Num);
        System.out.println("Sorted list : "+Num);

        int Max = Collections.max(Num);
        int Min = Collections.min(Num);
        System.out.println("Max is : "+Max+ ",  Min is : "+Min);

        Collections.reverse(Num);
        System.out.println("Reverse is : "+Num);
    }
}
