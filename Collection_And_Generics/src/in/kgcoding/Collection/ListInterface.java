package in.kgcoding.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List StrList = new ArrayList();
        StrList.add("Mahabir");
        StrList.add(" Mahato");
        StrList.add(1," Rabi");
        System.out.println(StrList);
        StrList.remove(0);

        for(int i=0;i<StrList.size();i++){
            System.out.println(StrList);
        }

        System.out.println(StrList.contains("Rabi"));

        for(Object str : StrList){
            System.out.print(str);
        }
    }
}
