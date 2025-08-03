package in.kgcoding.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",25);
        System.out.println(map.get("Apple"));
        map.put("Bimal",25);
        map.put("Gokul",25);
        map.put("Ramesh",65);
        System.out.println(map.size());
        System.out.println(map.containsKey("Gokul"));
        System.out.println(map.equals("Bimal"));
        System.out.println(map.remove("Apple"));
        System.out.println(map.size());
        map.put("001",954756540);
        System.out.println(map.get("001"));

        for(String key : map.keySet()){
            System.out.printf("%s : %s\n",key , map.get(key));
        }



    }
}
