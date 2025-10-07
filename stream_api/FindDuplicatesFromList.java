package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(7,5,8,7,6,9,3,4,5,4,6,2,7,6,5);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = num.stream().filter(s -> !set.add(s)).collect(Collectors.toSet());
        System.out.println(duplicate);
    }
}
