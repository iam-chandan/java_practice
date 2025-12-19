package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExmp {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,1,7,5,8,5,8,6,8};
        mostFrequentElement(arr);
    }

    private static void mostFrequentElement(int[] arr) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        for (int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int maxCount = 0,res = -1;
        for(var ent : map.entrySet()){
            System.out.println(ent);
            map.put(3,15);
        }
    }
}
