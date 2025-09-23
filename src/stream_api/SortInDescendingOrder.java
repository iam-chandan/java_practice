package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,2,7,6,8,9,42,7,3,4);
        List<Integer> sort = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sort);
    }
}
