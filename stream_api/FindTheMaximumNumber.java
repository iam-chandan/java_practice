package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindTheMaximumNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,8,5,47,6,95,50);
        int maximum = num.stream().max(Integer::compare).get();
        System.out.println("largest element is : " + maximum); // largest element is : 95
    }
}
