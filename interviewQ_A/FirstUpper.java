package interviewQ_A;

import java.util.*;
import java.util.stream.Collectors;

public class FirstUpper {
    public static void main(String[] args) {
        String str = "How are you";
        String[] st = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String s : st){
            sb.append(s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ");
        }
        System.out.println(sb.toString());

        System.out.println(toUpperOfFirstCharStreamList(str));

        System.out.println(toUpperOfFirstCharStreamString(str));

        System.out.println(toUpperOfFirstCharUsingCharArray(str));

        // Find missing number
        int[] nums = {1,2,5,6};
//        System.out.println(findMissingElement(nums,nums.length + 1));
//
//        System.out.println(findMissingElementXor(nums,nums.length + 1));
//
//        System.out.println(findMissingElementBoolean(nums,nums.length + 1));

        System.out.println(findMissingElementSet(nums,nums.length + 1));
    }
    public static List<String> toUpperOfFirstCharStreamList(String str){
        List<String> list = Collections.singletonList(Arrays.stream(str.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" ")));
        return list;
    }
    public static String toUpperOfFirstCharStreamString(String str){
        String list = Arrays.stream(str.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
        return list;
    }
    public static String toUpperOfFirstCharUsingCharArray(String str){
        char[] chars = str.toCharArray();

        boolean flag  = false;

        for (int i = 0; i < chars.length; i++) {
            if(flag && chars[i] != ' '){
                chars[i] = Character.toUpperCase(chars[i]);
                flag = false;
            }
            if (chars[i] == ' '){
                flag = true;
            }
        }
        return new String(chars);
    }
    public static int findMissingElement(int[] nums, int k) {
        int totalSum = k  * (k + 1)/2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return totalSum - actualSum;
    }
    public static int findMissingElementXor(int[] nums, int k) {
        int xor = 0;
        for (int i = 1; i <= k; i++) {
            xor ^= i;
//            System.out.println("xor at " + i + " " + xor);
        }

        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
    public static int findMissingElementBoolean(int[] nums, int k) {
        boolean[] flag = new boolean[k + 1];
        for (int i : nums) {
            flag[i] = true;
        }
        for(int i = 1;i <= k; i++){
            if(!flag[i]){
                return i;
            }
        }
        return 0;
    }
    public static List<Integer> findMissingElementSet(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            set.add(num);
        }

        for(int i = 1;i <= k; i++){
            if(!set.contains(i)){
                System.out.println("missing element : " + i);
                list.add(i);
            }
        }
        return list;
    }
}
