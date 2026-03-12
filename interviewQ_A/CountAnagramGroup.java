package interviewQ_A;

import java.util.Arrays;
import java.util.HashMap;

public class CountAnagramGroup {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
    public static int groupAnagrams(String[] str) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : str) {
            int[] arr = new int[26];
            for (char c : s.toCharArray()){
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map.size();
    }
}
