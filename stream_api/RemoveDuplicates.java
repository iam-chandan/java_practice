package stream_api;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,5,2,5,8,6,8,9,9,5,2);
        List<Integer> dist = num.stream().distinct().toList();
        System.out.println(dist);
    }
}
