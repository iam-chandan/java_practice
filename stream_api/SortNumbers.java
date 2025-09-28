package stream_api;

import java.util.Arrays;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,5,8,6,9,2,5,6);
        List<Integer> sorted = nums.stream().sorted().toList();
        System.out.println(sorted); // [1, 2, 2, 4, 5, 5, 6, 6, 8, 9]
    }
}
