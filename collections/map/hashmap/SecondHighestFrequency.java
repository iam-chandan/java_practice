package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestFrequency {
    public static void main(String[] args) {
        String str = "abcdaba";
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int highest = 0;
        int secondHighest = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > highest){
                secondHighest = highest;
                highest = entry.getValue();
            } else if (entry.getValue() > secondHighest && entry.getValue() < highest) {
                secondHighest = entry.getValue();
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == secondHighest){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
