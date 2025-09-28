package stream_api;

import java.util.Arrays;
import java.util.List;

public class CountNumbersGreaterThan5 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,4,5,7,8,1,2,6,9,10,14,2,45);
        long counts = num.stream().filter(n -> n >= 5).count();
        System.out.println(counts);
    }
}
