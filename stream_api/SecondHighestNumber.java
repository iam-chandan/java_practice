package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(7,5,8,7,6,9,3,4,5,4,6,2,7,6,5);
        Integer second = num.stream().sorted((a, b) -> b - a).skip(1).findFirst().orElse(null);
        num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
        System.out.println(second);
    }
}
