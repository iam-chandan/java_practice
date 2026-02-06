package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindMaximumNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(7,5,8,7,6,9,3,4,5,4,6,2,7,6,5);
        Integer max = num.stream().max((a, b) -> a - b).get();
        System.out.println(max);
    }
}
