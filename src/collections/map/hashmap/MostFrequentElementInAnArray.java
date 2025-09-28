package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,1,7,5,8,5,8,6,8};
        mostFrequentElement(arr);
    }

    private static void mostFrequentElement(int[] arr) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int maxCount = 0,res = -1;
        for(var ent : map.entrySet()){
            int val = ent.getKey();
            int cnt = ent.getValue();
            if(maxCount < cnt || (maxCount == cnt && res < val)){
                res = val;
                maxCount = cnt;
            }
        }
        System.out.println("most frequency number : " + res);
    }
}
