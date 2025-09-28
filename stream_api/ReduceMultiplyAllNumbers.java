package stream_api;

import java.util.Arrays;
import java.util.List;

public class ReduceMultiplyAllNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,5,3,6,8,9,3,5);
        long multi = nums.stream().reduce(1,(a,b) -> a*b);
        System.out.println("multiplication of all elements : " + multi); // multiplication of all elements : 194400
    }
}
