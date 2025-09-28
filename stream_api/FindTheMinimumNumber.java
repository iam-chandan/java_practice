package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindTheMinimumNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,78,96,41,52,2,35,15,12,8,-5);
        int minimum = num.stream().min(Integer::compare).get();
        System.out.println("smallest number is : " + minimum); // smallest number is : -5
    }
}
