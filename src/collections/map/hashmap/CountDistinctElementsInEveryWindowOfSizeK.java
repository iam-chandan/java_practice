package collections.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        countDistinct(arr,k);
    }

    private static void countDistinct(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();

        for (int i = 0;i < k;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        res.add(freq.size());

        for (int i = k;i < n;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            freq.put(arr[i - k],freq.get(arr[i - k])-1);

            if (freq.get(arr[i - k]) == 0){
                freq.remove(arr[i - k]);
            }
            res.add(freq.size());
        }
        System.out.println(res);
    }
}
