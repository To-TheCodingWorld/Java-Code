package in.kgcoding.Collection;

import in.kgcoding.Utility;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        System.out.print(name.add("Ramesh"));
        System.out.print(name.add("Sachin"));
        System.out.println(name.add("Tendulkar"));
        Utility.Print(name);
//        System.out.println(name.remove("Ramesh"));
        Utility.Print(name);
        System.out.println(name.add("Ramesh"));
        Utility.Print(name);
        System.out.println(name.contains("Sachin"));
        System.out.println(name.contains("Gokul"));
    }
}
