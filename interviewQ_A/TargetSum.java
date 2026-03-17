package interviewQ_A;

import java.util.*;

/*
Given an array of integers nums and an integer target, return the indices of
the two numbers such that they add up to the target.

Input: nums = [11, 15, 7, 2], target = 9

Output: [2, 3] (because 2 + 7 = 9)
 */
public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {11,15,7,2};
        int target = 9;
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 1;j < arr.length;j++){
                if(arr[i] + arr[j] == target){
                    result.add(i);
                    result.add(j);
                    break;
                }
            }
        }
        System.out.println(result);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(Arrays.asList(map.get(complement), i));
                return;
            }

            map.put(arr[i], i);
        }
    }
//    public int[]  twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {}
//    }
}
