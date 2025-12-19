package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Exmp2 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,12);
        map.put(2,15);
        map.put(1,42);
        for (Map.Entry<Integer,Integer> temp: map.entrySet()){
            System.out.println(temp.getKey() +" : "+temp.getValue());

        }
    }
}
