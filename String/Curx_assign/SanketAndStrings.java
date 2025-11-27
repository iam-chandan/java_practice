package String.Curx_assign;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SanketAndStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        String str = scn.next();

        System.out.println(longestString(str,k));
    }
    static int longestString(String str,int k){
        int n = str.length();
        Map<Character,Integer> freq = new HashMap<>();
        int maxFreq = 0;
        int res = 0;
        int left = 0;
        for (int right = 0; right < str.length(); right++) {
            freq.put(str.charAt(right),freq.getOrDefault(str.charAt(right),0)+1);
            maxFreq = Math.max(maxFreq,freq.get(str.charAt(left)) - 1);

            if(right - left + 1 - maxFreq > k){
                freq.put(str.charAt(left),freq.get(str.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res , res - left + 1);
        }
        return res;
    }
}
