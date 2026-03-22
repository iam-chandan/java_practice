package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapToInt {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11);
        Integer result = list.stream().mapToInt(i -> Integer.parseInt(i.toString())).sum();
        System.out.println(result);
    }
}
