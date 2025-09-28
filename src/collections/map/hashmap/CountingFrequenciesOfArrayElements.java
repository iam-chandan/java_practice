package collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountingFrequenciesOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {2,5,6,2,7,8,9,1,4,5,8};
        countFrequency(arr);
    }

    private static void countFrequency(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for (int ele : arr){
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }

        Set<Map.Entry<Integer,Integer>> set = freq.entrySet();
        Iterator<Map.Entry<Integer,Integer>> itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry<Integer,Integer> et = itr.next();
            System.out.println("key : " + et.getKey() + " value : " + et.getValue());
        }
    }
}
